package c4;

/* loaded from: classes15.dex */
public final class n0 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final c4.k0 f119862a;

    public n0(p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33 abstractServiceC1134x1ae0da33) {
        this.f119862a = new c4.k0(abstractServiceC1134x1ae0da33);
    }

    public void a(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        android.os.Bundle data = message.getData();
        int i17 = message.what;
        c4.k0 k0Var = this.f119862a;
        switch (i17) {
            case 1:
                android.os.Bundle bundle = data.getBundle("data_root_hints");
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(bundle);
                java.lang.String string = data.getString("data_package_name");
                int i18 = data.getInt("data_calling_pid");
                int i19 = data.getInt("data_calling_uid");
                c4.m0 m0Var = new c4.m0(message.replyTo);
                p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33 abstractServiceC1134x1ae0da33 = k0Var.f119850a;
                boolean z17 = false;
                if (string == null) {
                    abstractServiceC1134x1ae0da33.getClass();
                } else {
                    java.lang.String[] packagesForUid = abstractServiceC1134x1ae0da33.getPackageManager().getPackagesForUid(i19);
                    int length = packagesForUid.length;
                    int i27 = 0;
                    while (true) {
                        if (i27 < length) {
                            if (packagesForUid[i27].equals(string)) {
                                z17 = true;
                            } else {
                                i27++;
                            }
                        }
                    }
                }
                if (z17) {
                    abstractServiceC1134x1ae0da33.f93239h.a(new c4.b0(k0Var, m0Var, string, i18, i19, bundle));
                    return;
                }
                throw new java.lang.IllegalArgumentException("Package/uid mismatch: uid=" + i19 + " package=" + string);
            case 2:
                k0Var.f119850a.f93239h.a(new c4.c0(k0Var, new c4.m0(message.replyTo)));
                return;
            case 3:
                android.os.Bundle bundle2 = data.getBundle("data_options");
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(bundle2);
                k0Var.f119850a.f93239h.a(new c4.d0(k0Var, new c4.m0(message.replyTo), data.getString("data_media_item_id"), j3.e.a(data, "data_callback_token"), bundle2));
                return;
            case 4:
                k0Var.f119850a.f93239h.a(new c4.e0(k0Var, new c4.m0(message.replyTo), data.getString("data_media_item_id"), j3.e.a(data, "data_callback_token")));
                return;
            case 5:
                java.lang.String string2 = data.getString("data_media_item_id");
                p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c c0050x5b3754c = (p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c) data.getParcelable("data_result_receiver");
                c4.m0 m0Var2 = new c4.m0(message.replyTo);
                k0Var.getClass();
                if (android.text.TextUtils.isEmpty(string2) || c0050x5b3754c == null) {
                    return;
                }
                k0Var.f119850a.f93239h.a(new c4.f0(k0Var, m0Var2, string2, c0050x5b3754c));
                return;
            case 6:
                android.os.Bundle bundle3 = data.getBundle("data_root_hints");
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(bundle3);
                k0Var.f119850a.f93239h.a(new c4.g0(k0Var, new c4.m0(message.replyTo), data.getInt("data_calling_uid"), data.getString("data_package_name"), data.getInt("data_calling_pid"), bundle3));
                return;
            case 7:
                k0Var.f119850a.f93239h.a(new c4.h0(k0Var, new c4.m0(message.replyTo)));
                return;
            case 8:
                android.os.Bundle bundle4 = data.getBundle("data_search_extras");
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(bundle4);
                java.lang.String string3 = data.getString("data_search_query");
                p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c c0050x5b3754c2 = (p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c) data.getParcelable("data_result_receiver");
                c4.m0 m0Var3 = new c4.m0(message.replyTo);
                k0Var.getClass();
                if (android.text.TextUtils.isEmpty(string3) || c0050x5b3754c2 == null) {
                    return;
                }
                k0Var.f119850a.f93239h.a(new c4.i0(k0Var, m0Var3, string3, bundle4, c0050x5b3754c2));
                return;
            case 9:
                android.os.Bundle bundle5 = data.getBundle("data_custom_action_extras");
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(bundle5);
                java.lang.String string4 = data.getString("data_custom_action");
                p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c c0050x5b3754c3 = (p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c) data.getParcelable("data_result_receiver");
                c4.m0 m0Var4 = new c4.m0(message.replyTo);
                k0Var.getClass();
                if (android.text.TextUtils.isEmpty(string4) || c0050x5b3754c3 == null) {
                    return;
                }
                k0Var.f119850a.f93239h.a(new c4.j0(k0Var, m0Var4, string4, bundle5, c0050x5b3754c3));
                return;
            default:
                message.toString();
                return;
        }
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(android.os.Message message, long j17) {
        android.os.Bundle data = message.getData();
        data.setClassLoader(p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.m.class.getClassLoader());
        data.putInt("data_calling_uid", android.os.Binder.getCallingUid());
        int callingPid = android.os.Binder.getCallingPid();
        if (callingPid > 0) {
            data.putInt("data_calling_pid", callingPid);
        } else if (!data.containsKey("data_calling_pid")) {
            data.putInt("data_calling_pid", -1);
        }
        return super.sendMessageAtTime(message, j17);
    }
}
