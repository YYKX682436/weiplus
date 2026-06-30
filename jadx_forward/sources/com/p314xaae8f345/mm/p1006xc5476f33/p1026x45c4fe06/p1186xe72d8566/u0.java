package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

/* loaded from: classes7.dex */
public final class u0 {
    public u0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String posterTaskId, android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(posterTaskId, "posterTaskId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("completePosterTask: posterTaskId=");
        sb6.append(posterTaskId);
        sb6.append(", bitmap=");
        sb6.append(bitmap != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReturnGeneratedPoster", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.v0) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.z0.f170130h.remove(posterTaskId);
        if (v0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiReturnGeneratedPoster", "poster task not found, posterTaskId=".concat(posterTaskId));
            return;
        }
        oz5.i iVar = v0Var.f170117c;
        if (((p3325xe03a0797.p3326xc267989b.c3) iVar).A()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiReturnGeneratedPoster", "poster task already completed, posterTaskId=".concat(posterTaskId));
        } else {
            ((p3325xe03a0797.p3326xc267989b.a0) iVar).U(bitmap);
        }
    }
}
