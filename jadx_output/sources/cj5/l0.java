package cj5;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.m0 f42179d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(cj5.m0 m0Var) {
        super(1);
        this.f42179d = m0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.s)) {
            cj5.m0 m0Var = this.f42179d;
            java.lang.String stringExtra = m0Var.getActivity().getIntent().getStringExtra("KEY_PRE_SELECT_CONTACT_USERNAME_LIST_STRING");
            if (stringExtra != null) {
                java.util.List f07 = r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = f07.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (((java.lang.String) next).length() > 0) {
                        arrayList.add(next);
                    }
                }
                if (!(!arrayList.isEmpty())) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    ((com.tencent.mm.pluginsdk.ui.MultiSelectContactView) m0Var.getRootView().findViewById(com.tencent.mm.R.id.cek)).post(new cj5.k0(m0Var, arrayList));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
