package g22;

/* loaded from: classes15.dex */
public final class p implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318 f349386d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318 abstractC13361x415b318) {
        this.f349386d = abstractC13361x415b318;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        android.app.ProgressDialog progressDialog;
        java.lang.Integer num = (java.lang.Integer) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318 abstractC13361x415b318 = this.f349386d;
        java.lang.String str = abstractC13361x415b318.f179945d;
        int i17 = abstractC13361x415b318.n0().f349365q;
        boolean z17 = false;
        if (num != null && num.intValue() == i17) {
            i22.s m07 = this.f349386d.m0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q qVar = this.f349386d.n0().f349356e;
            if (qVar == null) {
                m07.getClass();
            } else {
                m07.f369558r = qVar;
                java.util.ArrayList arrayList = m07.f369550g;
                arrayList.clear();
                arrayList.addAll(kz5.n0.S0(qVar.f179128a));
                m07.f369553m.clear();
                m07.m8146xced61ae5();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318 abstractC13361x415b3182 = this.f349386d;
            if (abstractC13361x415b3182.f179960v) {
                abstractC13361x415b3182.f179960v = false;
                ku5.u0 u0Var = ku5.t0.f394148d;
                g22.o oVar = new g22.o(this.f349386d);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(oVar, 500L, false);
                return;
            }
            return;
        }
        int i18 = this.f349386d.n0().f349366r;
        if (num != null && num.intValue() == i18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318 abstractC13361x415b3183 = this.f349386d;
            android.app.ProgressDialog progressDialog2 = abstractC13361x415b3183.f179953o;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                z17 = true;
            }
            if (!z17 || (progressDialog = abstractC13361x415b3183.f179953o) == null) {
                return;
            }
            progressDialog.dismiss();
            return;
        }
        int i19 = this.f349386d.n0().f349369u;
        if (num != null && num.intValue() == i19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318 abstractC13361x415b3184 = this.f349386d;
            android.view.View view = abstractC13361x415b3184.f179955q;
            if (view != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showLoadingUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showLoadingUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = abstractC13361x415b3184.f179956r;
            if (view2 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showLoadingUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showLoadingUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = abstractC13361x415b3184.f179952n;
            if (c1163xf1deaba4 == null) {
                return;
            }
            c1163xf1deaba4.setVisibility(8);
            return;
        }
        int i27 = this.f349386d.n0().f349367s;
        if (num != null && num.intValue() == i27) {
            this.f349386d.r0();
            return;
        }
        int i28 = this.f349386d.n0().f349368t;
        if (num != null && num.intValue() == i28) {
            this.f349386d.r0();
            return;
        }
        int i29 = this.f349386d.n0().f349370v;
        if (num != null && num.intValue() == i29) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318 abstractC13361x415b3185 = this.f349386d;
            android.view.View view3 = abstractC13361x415b3185.f179955q;
            if (view3 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showContentUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showContentUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view4 = abstractC13361x415b3185.f179956r;
            if (view4 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showContentUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showContentUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = abstractC13361x415b3185.f179952n;
            if (c1163xf1deaba42 == null) {
                return;
            }
            c1163xf1deaba42.setVisibility(0);
        }
    }
}
