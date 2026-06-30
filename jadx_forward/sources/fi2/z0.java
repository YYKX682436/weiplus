package fi2;

/* loaded from: classes10.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi2.j1 f344484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi2.w f344485e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(fi2.j1 j1Var, zi2.w wVar) {
        super(0);
        this.f344484d = j1Var;
        this.f344485e = wVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById;
        android.view.View findViewById2;
        android.view.View findViewById3;
        zi2.w wVar = this.f344485e;
        android.view.ViewGroup root = wVar.f446856d;
        fi2.j1 j1Var = this.f344484d;
        j1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        android.view.View inflate = ((android.view.ViewStub) root.findViewById(com.p314xaae8f345.mm.R.id.qrs)).inflate();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        j1Var.f344382d = inflate;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950) inflate.findViewById(com.p314xaae8f345.mm.R.id.qrr);
        if (c14245x86828950 != null) {
            j1Var.f344381c = c14245x86828950;
            fi2.w B = j1Var.B();
            B.getClass();
            jz5.g gVar = B.f344452e;
            android.view.ViewParent parent = ((mh2.k) ((jz5.n) gVar).mo141623x754a37bb()).getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView((mh2.k) ((jz5.n) gVar).mo141623x754a37bb());
            }
            android.view.ViewParent parent2 = B.m().getParent();
            android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(B.m());
            }
            c14245x86828950.getCoverBackgroundLayout().addView((mh2.k) ((jz5.n) gVar).mo141623x754a37bb(), new android.view.ViewGroup.LayoutParams(-1, -1));
            c14245x86828950.getSingContentLayout().addView(B.m(), new android.view.ViewGroup.LayoutParams(-1, -1));
            c14245x86828950.getSongListLayout().addView(((fg2.n0) ((jz5.n) B.f344453f).mo141623x754a37bb()).f343693a, new android.view.ViewGroup.LayoutParams(-2, -2));
            c14245x86828950.m56871x9cb6a6e4(new fi2.y0(c14245x86828950, j1Var, wVar));
            fi2.d dVar = (fi2.d) ((jz5.n) j1Var.f344387i).mo141623x754a37bb();
            dVar.getClass();
            android.view.ViewParent parent3 = dVar.d().getParent();
            android.view.ViewGroup viewGroup3 = parent3 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent3 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(dVar.d());
            }
            c14245x86828950.getChatVoiceRoomContentLayout().addView(dVar.d(), new android.view.ViewGroup.LayoutParams(-1, -2));
        }
        android.view.View view = j1Var.f344382d;
        if (view != null && (findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.r1m)) != null) {
            j1Var.f344400v = findViewById3;
            findViewById3.setBackgroundDrawable(null);
            android.view.View findViewById4 = findViewById3.findViewById(com.p314xaae8f345.mm.R.id.d0v);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = j1Var.f344382d;
        if (view2 != null && (findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.r1n)) != null) {
            j1Var.f344399u = findViewById2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x868289502 = j1Var.f344381c;
            if (c14245x868289502 != null) {
                c14245x868289502.m56872x88463d20(findViewById2);
            }
        }
        android.view.View view3 = j1Var.f344382d;
        if (view3 != null && (findViewById = view3.findViewById(com.p314xaae8f345.mm.R.id.r1o)) != null) {
            j1Var.f344401w = findViewById;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x868289503 = j1Var.f344381c;
            if (c14245x868289503 != null) {
                c14245x868289503.m56873xf768ac6b(findViewById);
            }
        }
        if (!zl2.r4.f555483a.w1()) {
            j1Var.C();
        }
        j1Var.A(8);
        return jz5.f0.f384359a;
    }
}
