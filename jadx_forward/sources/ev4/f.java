package ev4;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ev4.j f338479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f338480e;

    public f(ev4.j jVar, android.os.Bundle bundle) {
        this.f338479d = jVar;
        this.f338480e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tg0.c2 c2Var;
        tg0.y1 y1Var;
        ev4.d dVar = this.f338479d.f338486a.f348545f;
        if (dVar != null) {
            android.os.Bundle res = this.f338480e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(res, "res");
            java.lang.String string = res.getString("fts_key_req_id");
            java.lang.String string2 = res.getString("fts_key_json_data");
            boolean z17 = res.getBoolean("fts_key_new_query", true);
            fv4.i iVar = dVar.f338477b;
            if (iVar == null || (c2Var = iVar.f348542c) == null || (y1Var = c2Var.f500585g) == null) {
                return;
            }
            if (string2 == null) {
                string2 = "";
            }
            if (string == null) {
                string = "";
            }
            ((ch0.n) y1Var).f122776a.b0(string2, z17, string);
        }
    }
}
