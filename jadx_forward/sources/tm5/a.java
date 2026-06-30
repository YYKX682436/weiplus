package tm5;

/* loaded from: classes16.dex */
public final class a implements com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 {
    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629
    /* renamed from: cancelAllPendingVideoCompositionRequests */
    public void mo96820x3027e603() {
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629
    /* renamed from: release */
    public void mo96822x41012807() {
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629
    /* renamed from: renderContextChanged */
    public void mo96823x15c1613b(com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25702xbab3092a c25702xbab3092a) {
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629
    /* renamed from: requiredPixelBufferAttributesForRenderContext */
    public java.util.HashMap mo96824x2787b30e() {
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629
    /* renamed from: sourcePixelBufferAttributes */
    public java.util.HashMap mo96825x701ab02() {
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629
    /* renamed from: startVideoCompositionRequest */
    public void mo96826xbab63a9e(com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25699x9dbd9fd8 c25699x9dbd9fd8) {
        java.util.List<java.lang.Integer> m96900xe90befbe;
        if (c25699x9dbd9fd8 == null || (m96900xe90befbe = c25699x9dbd9fd8.m96900xe90befbe()) == null) {
            return;
        }
        for (java.lang.Integer num : m96900xe90befbe) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            c25699x9dbd9fd8.m96894x58b3683d(c25699x9dbd9fd8.m96906xcc32495d(num.intValue()));
        }
    }
}
