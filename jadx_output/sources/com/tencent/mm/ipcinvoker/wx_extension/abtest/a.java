package com.tencent.mm.ipcinvoker.wx_extension.abtest;

/* loaded from: classes8.dex */
class a implements com.tencent.mm.ipcinvoker.k0 {
    private a() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        if (!gm0.j1.i().f273208a.f273299d || !gm0.j1.b().f273254q) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCInvokeTask_GetABTestItem", "kernel or account not ready.");
            return null;
        }
        com.tencent.mm.storage.c z07 = com.tencent.mm.model.newabtest.z.Ai().z0(iPCString.f68406d);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("layerId", z07.field_layerId);
        bundle.putString("business", z07.field_business);
        bundle.putString("expId", z07.field_expId);
        bundle.putString("rawXML", z07.field_rawXML);
        bundle.putLong("startTime", z07.field_startTime);
        bundle.putLong("endTime", z07.field_endTime);
        bundle.putLong("sequence", z07.field_sequence);
        bundle.putInt("prioritylevel", z07.field_prioritylevel);
        bundle.putBoolean("needReport", z07.field_needReport);
        return bundle;
    }
}
