package com.tencent.mm.plugin.brandservice.ui.userinfo.ui;

/* loaded from: classes4.dex */
public final class e extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488252o6;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.brandservice.ui.userinfo.ui.a item = (com.tencent.mm.plugin.brandservice.ui.userinfo.ui.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.jbb);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.jbe);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) holder.itemView.findViewById(com.tencent.mm.R.id.jbc);
        r45.zm zmVar = item.f94559d;
        java.lang.String str3 = zmVar.f392204g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(zmVar.f392205h)) {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            textView.setText(c01.a2.e(str3));
        } else {
            textView.setText(zmVar.f392205h);
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        android.graphics.Bitmap a17 = com.tencent.mm.modelavatar.g.a(str3);
        if (a17 != null) {
            imageView.setImageBitmap(com.tencent.mm.sdk.platformtools.x.s0(a17, false, a17.getWidth() / 2));
        } else {
            o11.f fVar = new o11.f();
            fVar.f342093q = com.tencent.mm.R.drawable.bgo;
            fVar.f342079c = true;
            fVar.f342096t = true;
            n11.a.b().h(zmVar.f392206i, imageView, fVar.a());
        }
        java.util.LinkedList linkedList = zmVar.f392202e;
        kotlin.jvm.internal.o.e(linkedList, "null cannot be cast to non-null type java.util.LinkedList<com.tencent.mm.protocal.protobuf.BizManageScopeItem>");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.fl) it.next()).f374417e);
        }
        java.lang.String[] wordings = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        com.tencent.mm.plugin.brandservice.ui.userinfo.ui.f fVar2 = com.tencent.mm.plugin.brandservice.ui.userinfo.ui.f.f94570a;
        kotlin.jvm.internal.o.d(mMNeat7extView);
        kotlin.jvm.internal.o.g(wordings, "wordings");
        if (wordings.length == 0) {
            str = mMNeat7extView.getContext().getString(com.tencent.mm.R.string.ana);
            kotlin.jvm.internal.o.f(str, "getString(...)");
        } else if (wordings.length == 1) {
            str = wordings[0];
        } else {
            int length = wordings.length;
            int i19 = 0;
            java.lang.String str4 = "";
            for (int i27 = 0; i27 < length; i27++) {
                str4 = fVar2.b(wordings, i27);
                if (fVar2.a(mMNeat7extView, str4)) {
                    break;
                }
                i19 = i27;
            }
            if (i19 < 1) {
                str = str4;
            } else {
                java.lang.String str5 = "";
                while (-1 < i19) {
                    java.lang.String b17 = fVar2.b(wordings, i19);
                    int length2 = (wordings.length - 1) - i19;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(b17);
                    if (length2 > 0) {
                        java.lang.String string = mMNeat7extView.getContext().getString(com.tencent.mm.R.string.and);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        str2 = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(length2)}, 1));
                        kotlin.jvm.internal.o.f(str2, "format(...)");
                    } else {
                        str2 = "";
                    }
                    sb6.append(str2);
                    str5 = sb6.toString();
                    if (!fVar2.a(mMNeat7extView, str5)) {
                        break;
                    } else {
                        i19--;
                    }
                }
                str = str5;
            }
        }
        mMNeat7extView.b(str);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
