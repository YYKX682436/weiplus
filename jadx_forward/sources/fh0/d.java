package fh0;

/* loaded from: classes5.dex */
public final class d implements e70.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344057a;

    public d(java.lang.String str) {
        this.f344057a = str;
    }

    @Override // e70.c0
    public void d(com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.a abortInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abortInfo, "abortInfo");
        fh0.b bVar = (fh0.b) fh0.k.f344067e.get(this.f344057a);
        if (bVar != null) {
            bVar.f344053c = "ABORT";
        }
        fh0.k.f344063a.a();
    }

    @Override // e70.c0
    public void e(java.util.List data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        fh0.b bVar = (fh0.b) fh0.k.f344067e.get(this.f344057a);
        if (bVar == null) {
            return;
        }
        java.util.Iterator it = data.iterator();
        while (it.hasNext()) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(((com.p314xaae8f345.mm.p2495xc50a8b8b.g) it.next()).i());
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("type"), com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24)) {
                    java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                    boolean z17 = true;
                    if (optString.length() > 0) {
                        bVar.f344054d += optString.length();
                        if (bVar.f344055e.length() != 0) {
                            z17 = false;
                        }
                        if (z17) {
                            bVar.f344055e = r26.p0.E0(optString, 10);
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeClawStream.DataShower", "getILinkListener onReceive parse error: " + e17.getMessage());
            }
        }
        fh0.k.f344063a.a();
    }

    @Override // e70.c0
    public void g(com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.x error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        fh0.b bVar = (fh0.b) fh0.k.f344067e.get(this.f344057a);
        if (bVar != null) {
            java.lang.String str = "ERR:" + error.name();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            bVar.f344053c = str;
        }
        fh0.k.f344063a.a();
    }

    @Override // e70.c0
    public void h() {
        fh0.b bVar = (fh0.b) fh0.k.f344067e.get(this.f344057a);
        if (bVar != null) {
            bVar.f344053c = "END";
        }
        fh0.k.f344063a.a();
    }

    @Override // e70.c0
    /* renamed from: onTimeout */
    public void mo123670x1554e82() {
        fh0.b bVar = (fh0.b) fh0.k.f344067e.get(this.f344057a);
        if (bVar != null) {
            bVar.f344053c = com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890.f6097xbb18f1ea;
        }
        fh0.k.f344063a.a();
    }
}
