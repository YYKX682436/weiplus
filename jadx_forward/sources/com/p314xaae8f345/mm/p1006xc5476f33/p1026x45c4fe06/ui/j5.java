package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class j5 implements db5.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da f171336a;

    public j5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.k5 k5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da activityC12645x113db0da) {
        this.f171336a = activityC12645x113db0da;
    }

    @Override // db5.a1
    /* renamed from: onFinish */
    public boolean mo26039x42fe6352(java.lang.CharSequence charSequence) {
        java.lang.String str;
        java.lang.String str2;
        if (android.text.TextUtils.isEmpty(charSequence)) {
            return false;
        }
        java.lang.String charSequence2 = charSequence.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((charSequence2 == null ? "" : charSequence2).endsWith("@app")) {
            str2 = charSequence2;
            str = null;
        } else {
            str = charSequence2;
            str2 = null;
        }
        c12559xbdae8559.f169323f = 1001;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.x.f166565a).b(this.f171336a, str2, str, null, 0, 0, c12559xbdae8559, null, null);
        return true;
    }
}
