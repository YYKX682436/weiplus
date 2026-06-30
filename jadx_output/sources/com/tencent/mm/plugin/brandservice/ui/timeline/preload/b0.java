package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/b0;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class b0 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        kotlin.jvm.internal.o.g(bundle, "bundle");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String string = bundle.getString("uri");
        int i17 = bundle.getInt("funId");
        int i18 = bundle.getInt("reqCmdId");
        int i19 = bundle.getInt("respCmdId");
        java.lang.String string2 = bundle.getString("reqClassName");
        java.lang.Class<?> cls = java.lang.Class.forName(java.lang.String.valueOf(bundle.getString("respClassName")));
        java.lang.Object newInstance = java.lang.Class.forName(java.lang.String.valueOf(string2)).newInstance();
        kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.RequestProtoBuf");
        r45.mr5 mr5Var = (r45.mr5) newInstance;
        mr5Var.parseFrom(bundle.getByteArray("req"));
        java.lang.String valueOf = java.lang.String.valueOf(string);
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.a0 a0Var = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.a0(callback);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = mr5Var;
        java.lang.Object newInstance2 = cls.newInstance();
        kotlin.jvm.internal.o.e(newInstance2, "null cannot be cast to non-null type com.tencent.mm.protobuf.BaseProtoBuf");
        lVar.f70665b = (com.tencent.mm.protobuf.f) newInstance2;
        lVar.f70666c = valueOf;
        lVar.f70667d = i17;
        lVar.f70668e = i18;
        lVar.f70669f = i19;
        com.tencent.mm.modelbase.z2.d(lVar.a(), new com.tencent.mm.plugin.brandservice.ui.timeline.preload.v(a0Var), false);
    }
}
