package oo5;

/* loaded from: classes8.dex */
public final class d implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oo5.e f428737d;

    public d(oo5.e eVar) {
        this.f428737d = eVar;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public final void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff call, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        int i17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        oo5.e eVar = this.f428737d;
        eVar.getClass();
        java.lang.String str = call.f71610xbfc5d0e1;
        if (str != null) {
            int hashCode = str.hashCode();
            java.lang.String str2 = eVar.f428743i;
            if (hashCode != -1663273296) {
                if (hashCode != -14160099) {
                    if (hashCode == 936400503 && str.equals("flipToPage")) {
                        java.lang.Integer num = (java.lang.Integer) call.m138433xa13f5ebd("pageIndex");
                        if (num == null) {
                            num = 0;
                        }
                        int intValue = num.intValue();
                        if (intValue < 0 || ((i18 = eVar.f428745n) > 0 && intValue >= i18)) {
                            java.lang.String str3 = "Invalid pageIndex: " + intValue + ", valid range: [0, " + eVar.f428745n + ')';
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMP.NativePreviewFileView", str3);
                            result.mo65718x5c4d208("INVALID_PAGE_INDEX", str3, null);
                            return;
                        }
                        try {
                            java.lang.String str4 = eVar.f428743i;
                            oo5.f fVar = eVar.f428742h;
                            com.p314xaae8f345.p3210x3857dc.r1.f(str4, fVar != null ? fVar.f428746a : null, intValue, 1.0f, 0, 0);
                            result.mo65720x90b54003(java.lang.Boolean.TRUE);
                            return;
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMP.NativePreviewFileView", "flipToPage failed", e17);
                            result.mo65718x5c4d208("FLIP_PAGE_FAILED", e17.getMessage(), null);
                            return;
                        }
                    }
                } else if (str.equals("requestThumbnail")) {
                    java.lang.Integer num2 = (java.lang.Integer) call.m138433xa13f5ebd("pageIndex");
                    if (num2 == null) {
                        num2 = 0;
                    }
                    int intValue2 = num2.intValue();
                    if (intValue2 >= 0 && ((i17 = eVar.f428745n) <= 0 || intValue2 < i17)) {
                        try {
                            oo5.f fVar2 = eVar.f428742h;
                            com.p314xaae8f345.p3210x3857dc.r1.e(str2, fVar2 != null ? fVar2.f428746a : null, intValue2);
                            result.mo65720x90b54003(java.lang.Boolean.TRUE);
                            return;
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMP.NativePreviewFileView", "requestThumbnail failed", e18);
                            result.mo65718x5c4d208("REQUEST_THUMBNAIL_FAILED", e18.getMessage(), null);
                            return;
                        }
                    }
                    java.lang.String str5 = "Invalid pageIndex: " + intValue2 + ", valid range: [0, " + eVar.f428745n + ')';
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMP.NativePreviewFileView", str5);
                    result.mo65718x5c4d208("INVALID_PAGE_INDEX", str5, null);
                    return;
                }
            } else if (str.equals("closePreview")) {
                try {
                    oo5.f fVar3 = eVar.f428742h;
                    com.p314xaae8f345.p3210x3857dc.r1.a(str2, fVar3 != null ? fVar3.f428746a : null);
                    result.mo65720x90b54003(java.lang.Boolean.TRUE);
                    return;
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMP.NativePreviewFileView", "closePreview failed", e19);
                    result.mo65718x5c4d208("CLOSE_PREVIEW_FAILED", e19.getMessage(), null);
                    return;
                }
            }
        }
        result.mo65719xbc9fa82f();
    }
}
