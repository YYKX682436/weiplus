package wf;

/* loaded from: classes7.dex */
public class o extends tf.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wf.b f527010i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(wf.b bVar, eg.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x0 x0Var) {
        super(aVar, x0Var);
        this.f527010i = bVar;
    }

    @Override // tf.c
    public void a(java.lang.String str, sf.f fVar) {
        c(fVar);
        org.json.JSONObject c17 = fVar.c();
        if (str.contains("insert") || str.contains("update")) {
            if (c17.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15485x340d78e6)) {
                this.f500323d = c17.optBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15485x340d78e6);
            }
            java.lang.Boolean valueOf = c17.has("autoRotation") ? java.lang.Boolean.valueOf(c17.optBoolean("autoRotation", false)) : null;
            if (valueOf != null) {
                this.f500324e = valueOf.booleanValue();
            }
        } else if (str.contains("operate")) {
            java.lang.String optString = c17.optString("type");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && (optString.equalsIgnoreCase(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27) || optString.equalsIgnoreCase("resume"))) {
                this.f500323d = true;
            }
        } else if (str.contains("remove")) {
            this.f500323d = false;
        }
        this.f527010i.w();
    }

    @Override // tf.c
    public boolean b() {
        return !this.f527010i.H;
    }
}
