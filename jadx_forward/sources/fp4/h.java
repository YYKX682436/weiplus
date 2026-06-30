package fp4;

/* loaded from: classes10.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18800xbc8bc43d f346894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f346895e;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18800xbc8bc43d c18800xbc8bc43d, java.util.LinkedList linkedList, long j17) {
        this.f346894d = c18800xbc8bc43d;
        this.f346895e = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18800xbc8bc43d c18800xbc8bc43d = this.f346894d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c18800xbc8bc43d.f257468e;
        if (c1163xf1deaba4 != null) {
            if (c1163xf1deaba4.getWidth() <= 0) {
                c1163xf1deaba4.post(c18800xbc8bc43d.f257483w);
                return;
            }
            c18800xbc8bc43d.f257478r = i65.a.b(c18800xbc8bc43d.getContext(), 40);
            c18800xbc8bc43d.f257477q = ((c1163xf1deaba4.getWidth() - (c18800xbc8bc43d.f257478r * 2)) * 1.0f) / ((float) c18800xbc8bc43d.f257474n);
            float height = ((int) (r4 * ((float) c18800xbc8bc43d.f257473m))) / (c18800xbc8bc43d.f257472i * ((c1163xf1deaba4.getHeight() * 1.0f) / c18800xbc8bc43d.f257471h));
            java.util.LinkedList<kp4.c1> linkedList = this.f346895e;
            for (kp4.c1 c1Var : linkedList) {
                c1Var.f392609f = ((height / ((float) c18800xbc8bc43d.f257473m)) * ((float) (c1Var.f392608e - c1Var.f392607d))) / c1Var.f392630n.f257160l.f479039h;
                c1Var.f();
            }
            kp4.c1 c1Var2 = c18800xbc8bc43d.f257479s;
            int i17 = c18800xbc8bc43d.f257478r;
            c1Var2.f392606c = i17;
            kp4.c1 c1Var3 = c18800xbc8bc43d.f257480t;
            c1Var3.f392606c = i17;
            linkedList.add(0, c1Var2);
            linkedList.add(c1Var3);
            kp4.r rVar = c18800xbc8bc43d.f257469f;
            if (rVar != null) {
                rVar.z(linkedList);
            }
            kp4.r rVar2 = c18800xbc8bc43d.f257469f;
            if (rVar2 != null) {
                rVar2.m8146xced61ae5();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18799x4530423d seekSlider = c18800xbc8bc43d.getSeekSlider();
            if (seekSlider != null) {
                int width = c1163xf1deaba4.getWidth();
                int i18 = c18800xbc8bc43d.f257478r;
                seekSlider.post(new fp4.a(seekSlider, width - (i18 * 2), i18, (int) (((float) 1000) * c18800xbc8bc43d.f257477q)));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18799x4530423d seekSlider2 = c18800xbc8bc43d.getSeekSlider();
            if (seekSlider2 != null) {
                seekSlider2.m72560x853690dc(0.0f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18799x4530423d seekSlider3 = c18800xbc8bc43d.getSeekSlider();
            if (seekSlider3 != null) {
                seekSlider3.post(new fp4.g(c18800xbc8bc43d));
            }
        }
    }
}
