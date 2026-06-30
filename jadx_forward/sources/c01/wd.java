package c01;

/* loaded from: classes12.dex */
public class wd implements com.p314xaae8f345.mm.sdk.p2603x2137b148.h9 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.h9 f119090a;

    public wd() {
        c01.ee eeVar = c01.ee.f118701b;
        ((c01.xd) eeVar).mo13963xc84a8199();
        this.f119090a = eeVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.h9
    public java.lang.Object a(java.lang.Object obj, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f) {
        java.lang.String str = (java.lang.String) obj;
        boolean equals = str.equals("BRAND_Pay");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.h9 h9Var = this.f119090a;
        return (!equals || c01.je.a()) ? (!str.equals("BRAND_Credit_Card") || c01.je.a()) ? (!str.equals("BRAND_Transfer") || c01.je.a()) ? (!str.equals("BRAND_Scan_Payment") || c01.je.a()) ? (!str.equals("BRAND_Balance") || c01.je.a()) ? (!str.equals("Cards_and_Offers") || c01.je.a()) ? (!str.equals("BRAND_Wallet") || c01.je.a()) ? (!str.equals("BRAND_Split_Bill") || c01.je.a()) ? (!str.equals("BRAND_Movie_Tickets") || c01.je.a()) ? (!str.equals("BRAND_hongbao") || c01.je.a()) ? (!str.equals("Webeans_domestic") || c01.je.a()) ? (str.equals("Webeans_oversesa") && c01.je.a()) ? (java.lang.String) ((c01.xd) h9Var).a("Webeans_domestic", c19767x257d7f) : (java.lang.String) ((c01.xd) h9Var).a(str, c19767x257d7f) : (java.lang.String) ((c01.xd) h9Var).a("Webeans_oversesa", c19767x257d7f) : (java.lang.String) ((c01.xd) h9Var).a("BRAND_hongbao_Oversea", c19767x257d7f) : (java.lang.String) ((c01.xd) h9Var).a("BRAND_Movie_Tickets_Oversea", c19767x257d7f) : (java.lang.String) ((c01.xd) h9Var).a("BRAND_Split_Bill_Oversea", c19767x257d7f) : (java.lang.String) ((c01.xd) h9Var).a("BRAND_Wallet_Oversea", c19767x257d7f) : (java.lang.String) ((c01.xd) h9Var).a("Cards_and_Offers_Oversea", c19767x257d7f) : (java.lang.String) ((c01.xd) h9Var).a("BRAND_Balance_Oversea", c19767x257d7f) : (java.lang.String) ((c01.xd) h9Var).a("BRAND_Scan_Payment_Oversea", c19767x257d7f) : (java.lang.String) ((c01.xd) h9Var).a("BRAND_Transfer_Oversea", c19767x257d7f) : (java.lang.String) ((c01.xd) h9Var).a("BRAND_Credit_Card_Oversea", c19767x257d7f) : (java.lang.String) ((c01.xd) h9Var).a("BRAND_Pay_Oversea", c19767x257d7f);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.h9
    /* renamed from: reload */
    public void mo13963xc84a8199() {
        this.f119090a.mo13963xc84a8199();
    }
}
