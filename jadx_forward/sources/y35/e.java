package y35;

/* loaded from: classes11.dex */
public class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a f540740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y35.g f540741e;

    public e(y35.g gVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a) {
        this.f540741e = gVar;
        this.f540740d = c21503x6e5a020a;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        y35.g gVar = this.f540741e;
        java.lang.String trim = this.f540740d.m79028xfb85ada3().toString().trim();
        if (trim == null || trim.length() <= 0) {
            return;
        }
        try {
            y35.d.a(gVar.f540744d, trim);
            android.content.Context context = gVar.f540744d.f540729d;
            if (context instanceof android.app.Activity) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(((android.app.Activity) context).getIntent(), 29, 1, y35.d.f540728o.f540752a);
                y35.k kVar = gVar.f540744d.f540734i;
                if (kVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.r0) kVar).f235130b;
                    e0Var.e(2L, e0Var.f234953d);
                }
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FMessageItemView", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = gVar.f540744d.f540733h;
            if (u3Var == null || !u3Var.isShowing()) {
                return;
            }
            gVar.f540744d.f540733h.dismiss();
        }
    }
}
