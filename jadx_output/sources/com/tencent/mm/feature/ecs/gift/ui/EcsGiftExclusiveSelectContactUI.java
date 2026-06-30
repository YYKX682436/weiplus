package com.tencent.mm.feature.ecs.gift.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/feature/ecs/gift/ui/EcsGiftExclusiveSelectContactUI;", "Lcom/tencent/mm/ui/contact/MMBaseSelectContactUI;", "<init>", "()V", "plugin-gift_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EcsGiftExclusiveSelectContactUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI {
    public static final /* synthetic */ int F = 0;
    public java.lang.String C = "";
    public java.util.List D = new java.util.ArrayList();
    public java.lang.String[] E;

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        p00.a aVar = new p00.a();
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(this.D, ",");
        kotlin.jvm.internal.o.f(c17, "listToString(...)");
        aVar.f350348b = c17;
        java.lang.String str = this.C;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        aVar.f350349c = str;
        aVar.f350347a = true;
        return new p00.c(this, null, true, false, aVar);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        rd0.j1 j1Var = (rd0.j1) i95.n0.c(rd0.j1.class);
        java.lang.String str = this.C;
        java.util.HashSet d17 = kz5.p1.d(c01.z1.r());
        ((qd0.y0) j1Var).getClass();
        return new com.tencent.mm.ui.contact.e5(this, str, 11, false, d17);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        return "";
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        boolean z17;
        int headerViewsCount = i17 - this.f206446d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftExclusiveSelectContactUI", "handle item click, position:" + i17 + ", offsetPosition:" + headerViewsCount);
        com.tencent.mm.ui.contact.item.d item = b7().getItem(headerViewsCount);
        if (item == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftExclusiveSelectContactUI", "select item is empty, position:" + i17);
            return;
        }
        java.lang.String str = item.f206850s;
        if (str == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftExclusiveSelectContactUI", "select item contactUsername is empty, position:" + i17);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftExclusiveSelectContactUI", "select item user:" + str + ", select item viewType:" + item.f206832a);
        kotlin.jvm.internal.o.d(str);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str2 = this.C;
        ((sg3.a) v0Var).getClass();
        java.lang.String f17 = c01.a2.f(str, str2);
        java.util.Iterator it = this.D.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            java.lang.String str3 = (java.lang.String) it.next();
            if (!kotlin.jvm.internal.o.b(str3, str)) {
                tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str4 = this.C;
                ((sg3.a) v0Var2).getClass();
                java.lang.String f18 = c01.a2.f(str3, str4);
                if (f18.equals(f17)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftExclusiveSelectContactUI", "hasSameDisplayUserName, find same, itemUserName:" + str3 + ", itemDisplayName:" + f18 + ", selectUserName:" + str + ", selectedDisplayName:" + f17);
                    z17 = true;
                    break;
                }
            }
        }
        if (z17) {
            db5.e1.G(getContext(), getString(com.tencent.mm.R.string.nef), "", false, new o00.a(this, str));
        } else {
            w7(str);
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        java.lang.String[] strArr = this.E;
        if (strArr != null) {
            kotlin.jvm.internal.o.d(strArr);
            if (!(strArr.length == 0)) {
                this.f206447e.setAlphabet(this.E);
            }
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return true;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.C = stringExtra;
        java.util.List L0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(this.C);
        kotlin.jvm.internal.o.f(L0, "getMemberListByChatroomName(...)");
        this.D = L0;
        L0.remove(c01.z1.r());
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public final void w7(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EcsGiftExclusiveSelectContactUI", "");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Contact", str);
        setResult(-1, intent);
        finish();
    }
}
