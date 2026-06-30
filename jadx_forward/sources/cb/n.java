package cb;

/* loaded from: classes13.dex */
public final class n extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cb.m f121688a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(cb.m mVar, android.os.Looper looper) {
        super(looper);
        this.f121688a = mVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        java.lang.String group;
        android.os.Bundle extras;
        java.lang.String str;
        cb.m mVar = this.f121688a;
        mVar.getClass();
        if (message != null) {
            java.lang.Object obj = message.obj;
            if (obj instanceof android.content.Intent) {
                android.content.Intent intent = (android.content.Intent) obj;
                intent.setExtrasClassLoader(new cb.z());
                if (intent.hasExtra("google.messenger")) {
                    android.os.Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof com.p176xb6135e39.p271xde6bf207.iid.zzi) {
                        mVar.f121686f = (com.p176xb6135e39.p271xde6bf207.iid.zzi) parcelableExtra;
                    }
                    if (parcelableExtra instanceof android.os.Messenger) {
                        mVar.f121685e = (android.os.Messenger) parcelableExtra;
                    }
                }
                android.content.Intent intent2 = (android.content.Intent) message.obj;
                java.lang.String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                        java.lang.String valueOf = java.lang.String.valueOf(action);
                        if (valueOf.length() != 0) {
                            "Unexpected response action: ".concat(valueOf);
                            return;
                        }
                        return;
                    }
                    return;
                }
                java.lang.String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (matcher.matches()) {
                        group = matcher.group(1);
                        java.lang.String group2 = matcher.group(2);
                        extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        mVar.a(group, extras);
                    }
                    if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                        str = "Unexpected response string: ";
                        if (stringExtra.length() == 0) {
                            return;
                        }
                        str.concat(stringExtra);
                        return;
                    }
                    return;
                }
                stringExtra = intent2.getStringExtra("error");
                if (stringExtra == null) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(intent2.getExtras()).length() + 49);
                    return;
                }
                if (android.util.Log.isLoggable("FirebaseInstanceId", 3) && stringExtra.length() != 0) {
                    "Received InstanceID error ".concat(stringExtra);
                }
                if (!stringExtra.startsWith("|")) {
                    synchronized (mVar.f121681a) {
                        int i17 = 0;
                        while (true) {
                            x.n nVar = mVar.f121681a;
                            if (i17 < nVar.f532379f) {
                                mVar.a((java.lang.String) nVar.h(i17), intent2.getExtras());
                                i17++;
                            }
                        }
                    }
                    return;
                }
                java.lang.String[] split = stringExtra.split("\\|");
                if (split.length <= 2 || !"ID".equals(split[1])) {
                    str = "Unexpected structured response ";
                    if (stringExtra.length() == 0) {
                        return;
                    }
                    str.concat(stringExtra);
                    return;
                }
                group = split[2];
                java.lang.String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                extras = intent2.putExtra("error", str2).getExtras();
                mVar.a(group, extras);
            }
        }
    }
}
