package ps2;

/* loaded from: classes10.dex */
public class e implements bi4.r0 {
    @Override // bi4.r0
    public al5.a0 A1(java.lang.String str, android.widget.FrameLayout container, pj4.j0 jumpInfo, pj4.t pullDownParam) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pullDownParam, "pullDownParam");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TextStatusProvider", "createPullDownView() called with: sourceId = " + str + ", container = " + container + ", jumpInfo = " + jumpInfo + ", pullDownParam = " + pullDownParam + " busiBuf.isNullOrNil::" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jumpInfo.f436674f));
        boolean z17 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jumpInfo.f436674f)) {
            c19792x256d2725 = b(android.util.Base64.decode(jumpInfo.f436675g, 0));
        } else {
            c19792x256d2725.mo11468x92b714fd(android.util.Base64.decode(jumpInfo.f436674f, 0));
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = c19792x256d2725;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d27252.m76802x2dd01666();
        if (m76802x2dd01666 != null && m76802x2dd01666.m76964x7f025288() == 2) {
            z17 = true;
        }
        return z17 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dm(str, container, jumpInfo, pullDownParam, c19792x256d27252) : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.km(str, container, jumpInfo, pullDownParam, c19792x256d27252);
    }

    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 b(byte[] bArr) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
        if (bArr != null) {
            pj4.s1 s1Var = new pj4.s1();
            s1Var.mo11468x92b714fd(bArr);
            c19792x256d2725.m76877x684351d(s1Var.f436819d);
            c19792x256d2725.m76896xfefec3e9(s1Var.f436820e);
        }
        return c19792x256d2725;
    }

    @Override // bi4.r0
    /* renamed from: release */
    public void mo10634x41012807() {
    }

    @Override // bi4.r0
    public bi4.o0 w7(java.lang.String str) {
        return new ps2.d(str, "Finder.TextStatusProvider");
    }
}
