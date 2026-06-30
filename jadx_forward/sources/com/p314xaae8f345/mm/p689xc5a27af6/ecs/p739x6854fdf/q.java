package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/feature/ecs/share/q;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/feature/ecs/share/EcsShareMgr$TaskParams;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class q implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.C10564x1d74f9a1 c10564x1d74f9a1 = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.C10564x1d74f9a1) obj;
        if (c10564x1d74f9a1 == null) {
            return null;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.n1 n1Var = com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.n1.EcsShareUserNameDecryptFail;
        boolean z17 = true;
        java.lang.String str3 = c10564x1d74f9a1.f147501d;
        int i17 = c10564x1d74f9a1.f147502e;
        if (i17 == 0) {
            int i18 = y02.c.f540130d;
            y02.a aVar = (y02.a) p3380x6a61f93.p3387xf51c6630.C30634x21b90e46.m170424x21b0d463();
            if (aVar != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "str");
                str = p3380x6a61f93.p3387xf51c6630.C30634x21b90e46.m170427x21b823e5(((y02.c) aVar).m105978x2737f10(), str3);
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a.f297578b.d(n1Var, 0, "genEncryptUserName empty, userName=" + str3);
            return null;
        }
        if (i17 != 1) {
            return null;
        }
        int i19 = y02.c.f540130d;
        y02.a aVar2 = (y02.a) p3380x6a61f93.p3387xf51c6630.C30634x21b90e46.m170424x21b0d463();
        if (aVar2 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "str");
            str2 = p3380x6a61f93.p3387xf51c6630.C30634x21b90e46.m170425x21b24678(((y02.c) aVar2).m105978x2737f10(), str3);
        } else {
            str2 = null;
        }
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str2);
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a.f297578b.d(n1Var, 0, "genDecryptUserName empty, encryptUserName=" + str3);
        return null;
    }
}
