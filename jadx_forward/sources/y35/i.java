package y35;

/* loaded from: classes11.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.my6 f540749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y35.d f540750e;

    public i(y35.d dVar, r45.my6 my6Var) {
        this.f540750e = dVar;
        this.f540749d = my6Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        y35.k kVar = this.f540750e.f540734i;
        if (kVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.r0) kVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var = r0Var.f235130b;
            r45.my6 my6Var = this.f540749d;
            if (my6Var == null || !android.text.TextUtils.equals(e0Var.f234954e.d1(), my6Var.f462463d) || android.text.TextUtils.isEmpty(my6Var.f462467h)) {
                e0Var.d(e0Var.f234953d, e0Var.f234954e, e0Var.f234956g, false, "");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "dealAddContact with antispamTicket: %s, username: %s", my6Var.f462467h, my6Var.f462463d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var2 = r0Var.f235130b;
            e0Var2.d(e0Var2.f234953d, e0Var2.f234954e, r0Var.f235129a, false, my6Var.f462467h);
        }
    }
}
