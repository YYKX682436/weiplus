package b53;

/* loaded from: classes8.dex */
public class g extends sd.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b53.i f99621a;

    public g(b53.i iVar) {
        this.f99621a = iVar;
    }

    @Override // sd.e
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(ya.b.f77504xbb80cbe3, this.f99621a.f99622d.f221101h);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // sd.e
    public java.lang.String b() {
        return "onAddShortcutStatus";
    }
}
