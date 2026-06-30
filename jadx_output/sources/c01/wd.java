package c01;

/* loaded from: classes12.dex */
public class wd implements com.tencent.mm.sdk.platformtools.h9 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.h9 f37557a;

    public wd() {
        c01.ee eeVar = c01.ee.f37168b;
        ((c01.xd) eeVar).reload();
        this.f37557a = eeVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.h9
    public java.lang.Object a(java.lang.Object obj, com.tencent.mm.pointers.PInt pInt) {
        java.lang.String str = (java.lang.String) obj;
        boolean equals = str.equals("BRAND_Pay");
        com.tencent.mm.sdk.platformtools.h9 h9Var = this.f37557a;
        return (!equals || c01.je.a()) ? (!str.equals("BRAND_Credit_Card") || c01.je.a()) ? (!str.equals("BRAND_Transfer") || c01.je.a()) ? (!str.equals("BRAND_Scan_Payment") || c01.je.a()) ? (!str.equals("BRAND_Balance") || c01.je.a()) ? (!str.equals("Cards_and_Offers") || c01.je.a()) ? (!str.equals("BRAND_Wallet") || c01.je.a()) ? (!str.equals("BRAND_Split_Bill") || c01.je.a()) ? (!str.equals("BRAND_Movie_Tickets") || c01.je.a()) ? (!str.equals("BRAND_hongbao") || c01.je.a()) ? (!str.equals("Webeans_domestic") || c01.je.a()) ? (str.equals("Webeans_oversesa") && c01.je.a()) ? (java.lang.String) ((c01.xd) h9Var).a("Webeans_domestic", pInt) : (java.lang.String) ((c01.xd) h9Var).a(str, pInt) : (java.lang.String) ((c01.xd) h9Var).a("Webeans_oversesa", pInt) : (java.lang.String) ((c01.xd) h9Var).a("BRAND_hongbao_Oversea", pInt) : (java.lang.String) ((c01.xd) h9Var).a("BRAND_Movie_Tickets_Oversea", pInt) : (java.lang.String) ((c01.xd) h9Var).a("BRAND_Split_Bill_Oversea", pInt) : (java.lang.String) ((c01.xd) h9Var).a("BRAND_Wallet_Oversea", pInt) : (java.lang.String) ((c01.xd) h9Var).a("Cards_and_Offers_Oversea", pInt) : (java.lang.String) ((c01.xd) h9Var).a("BRAND_Balance_Oversea", pInt) : (java.lang.String) ((c01.xd) h9Var).a("BRAND_Scan_Payment_Oversea", pInt) : (java.lang.String) ((c01.xd) h9Var).a("BRAND_Transfer_Oversea", pInt) : (java.lang.String) ((c01.xd) h9Var).a("BRAND_Credit_Card_Oversea", pInt) : (java.lang.String) ((c01.xd) h9Var).a("BRAND_Pay_Oversea", pInt);
    }

    @Override // com.tencent.mm.sdk.platformtools.h9
    public void reload() {
        this.f37557a.reload();
    }
}
