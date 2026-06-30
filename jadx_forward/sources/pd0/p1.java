package pd0;

/* loaded from: classes9.dex */
public class p1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public p1() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        am.ii iiVar;
        java.util.HashMap hashMap;
        java.lang.String str;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5667xda32364 c5667xda32364 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5667xda32364) abstractC20979x809547d1;
        if (c5667xda32364 == null || (iiVar = c5667xda32364.f135992g) == null || (hashMap = iiVar.f88487a) == null || hashMap.get("url") == null || !(hashMap.get("url") instanceof java.lang.String) || (str = (java.lang.String) hashMap.get("url")) == null) {
            return false;
        }
        if (str.equalsIgnoreCase("floatPay") || str.equalsIgnoreCase("jointPay")) {
            ((ku5.t0) ku5.t0.f394148d).h(new od0.j(), "SIRWorker");
            return false;
        }
        boolean equalsIgnoreCase = str.equalsIgnoreCase("offline");
        w04.l lVar = w04.l.INSTANCE;
        if (equalsIgnoreCase) {
            lVar.Nc();
            return false;
        }
        if (str.equalsIgnoreCase("walletUseCase")) {
            return false;
        }
        if (str.equalsIgnoreCase("faceCheckFrontUseCase")) {
            lVar.Y3(540999729);
            return false;
        }
        if (str.equalsIgnoreCase("faceCheckResultUseCase")) {
            lVar.Y3(540999730);
            return false;
        }
        if (str.equalsIgnoreCase("liteAppRealNameUseCase")) {
            lVar.Y3(540999733);
            return false;
        }
        if (str.equalsIgnoreCase("addPayCard")) {
            lVar.Y3(540999735);
            return false;
        }
        if (str.equalsIgnoreCase("unbindBankCardUseCase")) {
            lVar.Y3(540999736);
            return false;
        }
        if (str.equalsIgnoreCase("changeRealnameUseCase")) {
            lVar.Y3(540999737);
            return false;
        }
        if (str.equalsIgnoreCase("nfcPayOpenUseCase")) {
            lVar.Y3(540999738);
            return false;
        }
        if (str.equalsIgnoreCase("modifyPwdUseCase")) {
            lVar.Y3(540999739);
            return false;
        }
        if (!str.equalsIgnoreCase("resetPwdUseCase")) {
            return false;
        }
        lVar.Y3(540999740);
        return false;
    }
}
