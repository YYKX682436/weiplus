package com.tencent.mm.feature.ecs.share;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/feature/ecs/share/q;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/feature/ecs/share/EcsShareMgr$TaskParams;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class q implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.feature.ecs.share.EcsShareMgr$TaskParams ecsShareMgr$TaskParams = (com.tencent.mm.feature.ecs.share.EcsShareMgr$TaskParams) obj;
        if (ecsShareMgr$TaskParams == null) {
            return null;
        }
        com.tencent.wechat.mm.brand_service.n1 n1Var = com.tencent.wechat.mm.brand_service.n1.EcsShareUserNameDecryptFail;
        boolean z17 = true;
        java.lang.String str3 = ecsShareMgr$TaskParams.f65968d;
        int i17 = ecsShareMgr$TaskParams.f65969e;
        if (i17 == 0) {
            int i18 = y02.c.f458597d;
            y02.a aVar = (y02.a) urgen.ur_E2DE.UR_C62C.UR_1332();
            if (aVar != null) {
                kotlin.jvm.internal.o.g(str3, "str");
                str = urgen.ur_E2DE.UR_C62C.UR_A5D3(((y02.c) aVar).getCppPointer(), str3);
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                return new com.tencent.mm.ipcinvoker.type.IPCString(str);
            }
            com.tencent.wechat.aff.brand_service.a.f216045b.d(n1Var, 0, "genEncryptUserName empty, userName=" + str3);
            return null;
        }
        if (i17 != 1) {
            return null;
        }
        int i19 = y02.c.f458597d;
        y02.a aVar2 = (y02.a) urgen.ur_E2DE.UR_C62C.UR_1332();
        if (aVar2 != null) {
            kotlin.jvm.internal.o.g(str3, "str");
            str2 = urgen.ur_E2DE.UR_C62C.UR_48E7(((y02.c) aVar2).getCppPointer(), str3);
        } else {
            str2 = null;
        }
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            return new com.tencent.mm.ipcinvoker.type.IPCString(str2);
        }
        com.tencent.wechat.aff.brand_service.a.f216045b.d(n1Var, 0, "genDecryptUserName empty, encryptUserName=" + str3);
        return null;
    }
}
