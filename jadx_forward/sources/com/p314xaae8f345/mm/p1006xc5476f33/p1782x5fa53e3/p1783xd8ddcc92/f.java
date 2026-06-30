package com.p314xaae8f345.mm.p1006xc5476f33.p1782x5fa53e3.p1783xd8ddcc92;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/ilink/net_change/f;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "a", "plugin-ilink_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class f implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArraySet f223963d = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p971x6de15a2e.s0 f223964e = new com.p314xaae8f345.mm.p1006xc5476f33.p1782x5fa53e3.p1783xd8ddcc92.e();

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/ilink/net_change/f$a;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-ilink_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes8.dex */
    public static final class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
        @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
        /* renamed from: invoke */
        public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r callback) {
            android.os.Bundle data = (android.os.Bundle) obj;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
            if (!d83.e0.f308492b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetworkChangeSubProcessImpl", "ilink not initialized, just return");
                return;
            }
            int i17 = data.getInt("newState", 0);
            com.p314xaae8f345.p342x5fa53e3.C2952xf0b8386c.m22101x9cf0d20b().m22109xc67f70a6();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("err_code", 0);
            bundle.putString("err_desc", ya.b.f77504xbb80cbe3);
            callback.a(bundle);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkChangeSubProcessImpl", "invoke: IPCInvokeAsyncTask_OnNetworkChange " + i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r callback) {
        java.lang.String str;
        android.os.Bundle data = (android.os.Bundle) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String string = data.getString("from_process", "");
        int i17 = -1;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            if (r26.i0.y(string, "com.tencent.mm", false)) {
                int i18 = data.getInt("opcode", -1);
                com.p314xaae8f345.mm.p971x6de15a2e.s0 s0Var = f223964e;
                java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = f223963d;
                if (i18 == 0) {
                    copyOnWriteArraySet.add(string);
                    gm0.j1.n().a(s0Var);
                } else {
                    if (i18 != 1) {
                        i17 = -2;
                        str = "not valid op code";
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putInt("err_code", i17);
                        bundle.putString("err_desc", str);
                        callback.a(bundle);
                    }
                    gm0.j1.n().d(s0Var);
                    copyOnWriteArraySet.remove(string);
                }
                str = ya.b.f77504xbb80cbe3;
                i17 = 0;
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("err_code", i17);
                bundle2.putString("err_desc", str);
                callback.a(bundle2);
            }
        }
        str = "invalid package name " + string;
        android.os.Bundle bundle22 = new android.os.Bundle();
        bundle22.putInt("err_code", i17);
        bundle22.putString("err_desc", str);
        callback.a(bundle22);
    }
}
