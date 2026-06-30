package ch0;

/* loaded from: classes8.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f41197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch0.h f41198e;

    public d(android.os.Bundle bundle, ch0.h hVar) {
        this.f41197d = bundle;
        this.f41198e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tg0.y1 y1Var;
        android.os.Bundle bundle = this.f41197d;
        java.lang.String string = bundle.getString("fts_key_req_id");
        java.lang.String string2 = bundle.getString("fts_key_json_data");
        boolean z17 = bundle.getBoolean("fts_key_new_query", true);
        tg0.c2 c2Var = this.f41198e.f41214a;
        if (c2Var == null || (y1Var = c2Var.f419052g) == null) {
            return;
        }
        if (string2 == null) {
            string2 = "";
        }
        if (string == null) {
            string = "";
        }
        ((ch0.n) y1Var).f41243a.b0(string2, z17, string);
    }
}
