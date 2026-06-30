package hv0;

/* loaded from: classes5.dex */
public final class f implements com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hv0.i f366790a;

    public f(hv0.i iVar) {
        this.f366790a = iVar;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.m
    public void a(float f17, float f18, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q composingPanel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composingPanel, "composingPanel");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p f150738e = composingPanel.getF150738e();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p pVar = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p.f150780i;
        hv0.i iVar = this.f366790a;
        if (f150738e == pVar) {
            float f19 = iVar.f366793a * f18;
            yz5.p pVar2 = iVar.f366794b;
            if (pVar2 != null) {
                pVar2.mo149xb9724478(java.lang.Float.valueOf(f19), java.lang.Float.valueOf(f18));
                return;
            }
            return;
        }
        if (composingPanel.getF150738e() == com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p.f150778g) {
            float f27 = iVar.f366793a * f18;
            yz5.p pVar3 = iVar.f366794b;
            if (pVar3 != null) {
                pVar3.mo149xb9724478(java.lang.Float.valueOf(f27), java.lang.Float.valueOf(f18));
            }
        }
    }
}
