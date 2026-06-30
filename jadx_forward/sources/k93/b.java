package k93;

/* loaded from: classes11.dex */
public class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final k93.a f387417a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f387418b = false;

    public b(k93.a aVar) {
        this.f387417a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: clearView */
    public void mo8113xb4407692(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        if (k3Var instanceof k93.c0) {
            ((k93.c0) k3Var).a();
        }
        k93.a aVar = this.f387417a;
        if (aVar != null) {
            aVar.a();
        }
        super.mo8113xb4407692(c1163xf1deaba4, k3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: getMovementFlags */
    public int mo8119x457acf62(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        int i17 = 0;
        if (!(layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de)) {
            return 0;
        }
        int H = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).H();
        int i18 = 12;
        if (H == 0) {
            i17 = 12;
            i18 = 3;
        } else if (H == 1) {
            i17 = 3;
        } else {
            i18 = 0;
        }
        return p012xc85e97e9.p103xe821e364.p104xd1075a44.a1.m8110x3388cfca(i17, i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: isItemViewSwipeEnabled */
    public boolean mo8126x5b4a2f69() {
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: isLongPressDragEnabled */
    public boolean mo8127x3b3ada10() {
        return this.f387418b;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onMove */
    public boolean mo8132xc39cb650(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2) {
        k93.a aVar = this.f387417a;
        if (aVar != null) {
            return aVar.mo129213xc39cb650(k3Var.m8183xf806b362(), k3Var2.m8183xf806b362());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onSelectedChanged */
    public void mo8134xb54743ba(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        if (i17 != 0) {
            if (k3Var instanceof k93.c0) {
                ((k93.c0) k3Var).g();
            }
            k93.a aVar = this.f387417a;
            if (aVar != null) {
                aVar.mo129212xe1bd9a4d(k3Var.m8183xf806b362());
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onSwiped */
    public void mo8135x59f07f29(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        k93.a aVar = this.f387417a;
        if (aVar != null) {
            aVar.b(k3Var.m8183xf806b362());
        }
    }
}
