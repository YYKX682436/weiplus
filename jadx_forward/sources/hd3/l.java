package hd3;

/* loaded from: classes.dex */
public final class l extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "takeHeapSnapshot";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        boolean a17 = z65.c.a();
        lc3.z zVar = lc3.x.f399469c;
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiTakeHeapSnapshot", "no debug environment! please check");
            s().mo146xb9724478(i(zVar));
            return;
        }
        lc3.h0 h0Var = (lc3.h0) this.f399423a;
        if (h0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiTakeHeapSnapshot", "context not server type. not valid");
            s().mo146xb9724478(i(zVar));
            return;
        }
        java.lang.String optString = data.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        boolean z17 = true;
        boolean z18 = optString.length() == 0;
        lc3.z zVar2 = lc3.x.f399470d;
        if (z18 || !r26.i0.y(optString, "wxfile://", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiTakeHeapSnapshot", "invalid path=" + optString + ", must start with wxfile://");
            s().mo146xb9724478(i(zVar2));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.y5) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.q4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.q4.class))).wi(e().f425864a);
        if (wi6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiTakeHeapSnapshot", "MagicBrushFS not found, instanceName=" + e().f425864a);
            s().mo146xb9724478(i(zVar));
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 mo49629x74638431 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.l) wi6).mo49629x74638431(optString);
        java.lang.String o17 = mo49629x74638431 != null ? mo49629x74638431.o() : null;
        if (o17 != null && o17.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiTakeHeapSnapshot", "resolve physical path failed, wxPath=" + optString + ". hint: use wxfile://usr/xxx for persistent file");
            s().mo146xb9724478(i(zVar2));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiTakeHeapSnapshot", "take heap snapshot, wxPath=" + optString + ", physicalPath=" + o17);
        try {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(o17);
            if (!r6Var.m()) {
                com.p314xaae8f345.mm.vfs.r6 s17 = r6Var.s();
                if (s17 != null && !s17.m()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiTakeHeapSnapshot", "create parent dir for snapshot, path=" + s17.o() + ", ok=" + s17.J());
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiTakeHeapSnapshot", "create snapshot file, path=" + o17 + ", ok=" + r6Var.k());
            }
            h0Var.E0("(function() {var profiler = NativeGlobal.Profiler;var snapshot = profiler.takeHeapSnapshot();return snapshot.serialize('" + o17 + "');})()", new hd3.k(o17, this, optString));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiTakeHeapSnapshot", "ensure snapshot file failed, path=" + o17 + ", err=" + th6.getMessage());
            s().mo146xb9724478(i(zVar));
        }
    }
}
