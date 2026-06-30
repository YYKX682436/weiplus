package e22;

/* loaded from: classes10.dex */
public final class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13339x8f3095f9 f328186d;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13339x8f3095f9 activityC13339x8f3095f9) {
        this.f328186d = activityC13339x8f3095f9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/picker/MultiEmojiMediaPickerUI$initUnifiedFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13339x8f3095f9 activityC13339x8f3095f9 = this.f328186d;
        if (activityC13339x8f3095f9.X6().m20352xe06bcb0d() == 0) {
            e33.f2 f2Var = activityC13339x8f3095f9.f179677f;
            java.util.ArrayList y76 = f2Var != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) f2Var).y7() : null;
            if (y76 == null || y76.isEmpty()) {
                yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/picker/MultiEmojiMediaPickerUI$initUnifiedFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            activityC13339x8f3095f9.d7("clk_next_button", e22.e1.a(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13339x8f3095f9.f179687p, y76));
            activityC13339x8f3095f9.getClass();
            if (!y76.isEmpty()) {
                java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
                int size = y76.size();
                int[] iArr = new int[size];
                int i17 = 0;
                for (java.lang.Object obj : y76) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) obj;
                    arrayList2.add(abstractC15633xee433078.f219963e);
                    int i19 = 2;
                    if (abstractC15633xee433078.mo63659xfb85f7b0() != 2) {
                        i19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(abstractC15633xee433078.f219971p, "image/gif") ? 1 : 0;
                    }
                    iArr[i17] = i19;
                    i17 = i18;
                }
                if (!arrayList2.isEmpty()) {
                    if (!(size == 0)) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.setClass(activityC13339x8f3095f9, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9.class);
                        intent.putStringArrayListExtra("media_path_list", arrayList2);
                        intent.putExtra("media_type_list", iArr);
                        intent.putExtra("query_source_type", intent.getIntExtra("query_source_type", 11));
                        java.lang.String str = activityC13339x8f3095f9.f179691o;
                        if (str == null) {
                            str = "";
                        }
                        intent.putExtra("addstickers_sessionid", str);
                        intent.putExtra("key_from_scene", activityC13339x8f3095f9.f179679h);
                        activityC13339x8f3095f9.startActivityForResult(intent, 256);
                        activityC13339x8f3095f9.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559262q);
                    }
                }
            }
        } else {
            activityC13339x8f3095f9.d7("clk_next_button", kz5.b0.c(new or.a(1, 2, 3, null, 8, null)));
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13340xd9e4c60a c13340xd9e4c60a = activityC13339x8f3095f9.f179690n;
            if (c13340xd9e4c60a == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiFinderTabFragment");
                throw null;
            }
            e22.d1 d1Var = c13340xd9e4c60a.f179693i;
            if (d1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("findersFeedViewModel");
                throw null;
            }
            x0.i0 i0Var = d1Var.f328172m;
            if (!i0Var.isEmpty()) {
                c13340xd9e4c60a.j0(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) kz5.n0.X(i0Var)).mo14344x5f01b1f6());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/picker/MultiEmojiMediaPickerUI$initUnifiedFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
