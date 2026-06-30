package com.p314xaae8f345.tav.p2965xf0edce24;

/* renamed from: com.tencent.tav.extractor.ExtractorDelegateFactory */
/* loaded from: classes10.dex */
public class C25822x78481d21 {

    /* renamed from: extractorDelegateCreator */
    private static com.p314xaae8f345.tav.p2965xf0edce24.C25822x78481d21.IExtractorDelegateCreator f48553x76dd4823 = new com.p314xaae8f345.tav.p2965xf0edce24.C25822x78481d21.IExtractorDelegateCreator() { // from class: com.tencent.tav.extractor.ExtractorDelegateFactory.1
        @Override // com.p314xaae8f345.tav.p2965xf0edce24.C25822x78481d21.IExtractorDelegateCreator
        /* renamed from: createExtractorDelegate */
        public com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680 mo72472xd27ce22d() {
            return new com.p314xaae8f345.tav.p2965xf0edce24.C25819x28cbdcef();
        }
    };

    /* renamed from: com.tencent.tav.extractor.ExtractorDelegateFactory$IExtractorDelegateCreator */
    /* loaded from: classes10.dex */
    public interface IExtractorDelegateCreator {
        /* renamed from: createExtractorDelegate */
        com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680 mo72472xd27ce22d();
    }

    /* renamed from: createDelegate */
    public static com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680 m97984x67d326a1() {
        return f48553x76dd4823.mo72472xd27ce22d();
    }

    /* renamed from: setExtractorDelegateCreator */
    public static void m97985x56b6a2a5(com.p314xaae8f345.tav.p2965xf0edce24.C25822x78481d21.IExtractorDelegateCreator iExtractorDelegateCreator) {
        f48553x76dd4823 = iExtractorDelegateCreator;
    }
}
