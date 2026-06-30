package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.BaseGmsClient */
/* loaded from: classes13.dex */
public abstract class AbstractC1900x418ca687<T extends android.os.IInterface> {

    /* renamed from: CONNECT_STATE_CONNECTED */
    public static final int f5924x7123726 = 4;

    /* renamed from: CONNECT_STATE_DISCONNECTED */
    public static final int f5925x1c079cde = 1;

    /* renamed from: CONNECT_STATE_DISCONNECTING */
    public static final int f5926x64ec0f63 = 5;

    /* renamed from: DEFAULT_ACCOUNT */
    public static final java.lang.String f5927xf85e6def = "<<default account>>";

    /* renamed from: KEY_PENDING_INTENT */
    public static final java.lang.String f5929xa3daf464 = "pendingIntent";
    private volatile java.lang.String zzA;
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb zzB;
    private boolean zzC;
    private volatile com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzk zzD;
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzv zza;
    final android.os.Handler zzb;
    protected com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.ConnectionProgressReportCallbacks zzc;
    protected java.util.concurrent.atomic.AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile java.lang.String zzk;
    private final android.content.Context zzl;
    private final android.os.Looper zzm;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1911x7fb283e0 zzn;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a zzo;
    private final java.lang.Object zzp;
    private final java.lang.Object zzq;
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1917xe04b660a zzr;
    private android.os.IInterface zzs;
    private final java.util.ArrayList zzt;
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zze zzu;
    private int zzv;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.BaseConnectionCallbacks zzw;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.BaseOnConnectionFailedListener zzx;
    private final int zzy;
    private final java.lang.String zzz;
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] zze = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[0];

    /* renamed from: GOOGLE_PLUS_REQUIRED_FEATURES */
    public static final java.lang.String[] f5928xae5aa63e = {"service_esmobile", "service_googleme"};

    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks */
    /* loaded from: classes13.dex */
    public interface BaseConnectionCallbacks {

        /* renamed from: CAUSE_DEAD_OBJECT_EXCEPTION */
        public static final int f5930xff6ee234 = 3;

        /* renamed from: CAUSE_SERVICE_DISCONNECTED */
        public static final int f5931xbff01ddb = 1;

        /* renamed from: onConnected */
        void mo18126xdba42fea(android.os.Bundle bundle);

        /* renamed from: onConnectionSuspended */
        void mo18127x4511603e(int i17);
    }

    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener */
    /* loaded from: classes13.dex */
    public interface BaseOnConnectionFailedListener {
        /* renamed from: onConnectionFailed */
        void mo18128xce9394ba(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb);
    }

    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks */
    /* loaded from: classes13.dex */
    public interface ConnectionProgressReportCallbacks {
        /* renamed from: onReportServiceBinding */
        void mo17961x7bf20ce3(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb);
    }

    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter */
    /* loaded from: classes13.dex */
    public class LegacyClientCallbackAdapter implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.ConnectionProgressReportCallbacks {
        public LegacyClientCallbackAdapter() {
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.ConnectionProgressReportCallbacks
        /* renamed from: onReportServiceBinding */
        public final void mo17961x7bf20ce3(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
            if (!c1700xff0c58bb.m17605x6e268779()) {
                if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.this.zzx != null) {
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.this.zzx.mo18128xce9394ba(c1700xff0c58bb);
                    return;
                }
                return;
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca687 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.this;
            java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> mo18107x2efbaf95 = abstractC1900x418ca687.mo18107x2efbaf95();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(mo18107x2efbaf95);
            arrayList.add(null);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(abstractC1900x418ca687, arrayList.toArray(), "com/google/android/gms/common/internal/BaseGmsClient$LegacyClientCallbackAdapter", "onReportServiceBinding", "(Lcom/google/android/gms/common/ConnectionResult;)V", "com/google/android/gms/common/internal/BaseGmsClient", "getRemoteService", "(Lcom/google/android/gms/common/internal/IAccountAccessor;Ljava/util/Set;)V");
        }
    }

    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$SignOutCallbacks */
    /* loaded from: classes13.dex */
    public interface SignOutCallbacks {
        /* renamed from: onSignOutComplete */
        void mo17964x98c228cb();
    }

    public AbstractC1900x418ca687(android.content.Context context, android.os.Handler handler, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1911x7fb283e0 abstractC1911x7fb283e0, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a c1706xe937257a, int i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.BaseConnectionCallbacks baseConnectionCallbacks, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        this.zzk = null;
        this.zzp = new java.lang.Object();
        this.zzq = new java.lang.Object();
        this.zzt = new java.util.ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new java.util.concurrent.atomic.AtomicInteger(0);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(context, "Context must not be null");
        this.zzl = context;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(abstractC1911x7fb283e0, "Supervisor must not be null");
        this.zzn = abstractC1911x7fb283e0;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(c1706xe937257a, "API availability must not be null");
        this.zzo = c1706xe937257a;
        this.zzy = i17;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = null;
    }

    public static /* bridge */ /* synthetic */ void zzj(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca687, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzk zzkVar) {
        abstractC1900x418ca687.zzD = zzkVar;
        if (abstractC1900x418ca687.mo18125x70459ec2()) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1905x3d7caa5b c1905x3d7caa5b = zzkVar.zzd;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1926x87b70a74.m18225x9cf0d20b().zza(c1905x3d7caa5b == null ? null : c1905x3d7caa5b.zza());
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca687, int i17) {
        int i18;
        int i19;
        synchronized (abstractC1900x418ca687.zzp) {
            i18 = abstractC1900x418ca687.zzv;
        }
        if (i18 == 3) {
            abstractC1900x418ca687.zzC = true;
            i19 = 5;
        } else {
            i19 = 4;
        }
        android.os.Handler handler = abstractC1900x418ca687.zzb;
        handler.sendMessage(handler.obtainMessage(i19, abstractC1900x418ca687.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca687, int i17, int i18, android.os.IInterface iInterface) {
        synchronized (abstractC1900x418ca687.zzp) {
            if (abstractC1900x418ca687.zzv != i17) {
                return false;
            }
            abstractC1900x418ca687.zzp(i18, iInterface);
            return true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "set" is null
        	at java.base/java.util.BitSet.or(BitSet.java:945)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:759)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:838)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:711)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public static /* bridge */ /* synthetic */ boolean zzo(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 r2) {
        /*
            boolean r0 = r2.zzC
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.mo17561x83e1df4e()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.m18104x89d4ce9e()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.mo17561x83e1df4e()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.zzo(com.google.android.gms.common.internal.BaseGmsClient):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzp(int i17, android.os.IInterface iInterface) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzv zzvVar;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18197x312c1fe5((i17 == 4) == (iInterface != 0));
        synchronized (this.zzp) {
            this.zzv = i17;
            this.zzs = iInterface;
            if (i17 == 1) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zze zzeVar = this.zzu;
                if (zzeVar != null) {
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1911x7fb283e0 abstractC1911x7fb283e0 = this.zzn;
                    java.lang.String zzb = this.zza.zzb();
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(zzb);
                    abstractC1911x7fb283e0.zzb(zzb, this.zza.zza(), 4225, zzeVar, zze(), this.zza.zzc());
                    this.zzu = null;
                }
            } else if (i17 == 2 || i17 == 3) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zze zzeVar2 = this.zzu;
                if (zzeVar2 != null && (zzvVar = this.zza) != null) {
                    zzvVar.zzb();
                    zzvVar.zza();
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1911x7fb283e0 abstractC1911x7fb283e02 = this.zzn;
                    java.lang.String zzb2 = this.zza.zzb();
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(zzb2);
                    abstractC1911x7fb283e02.zzb(zzb2, this.zza.zza(), 4225, zzeVar2, zze(), this.zza.zzc());
                    this.zzd.incrementAndGet();
                }
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zze zzeVar3 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zze(this, this.zzd.get());
                this.zzu = zzeVar3;
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzv zzvVar2 = (this.zzv != 3 || m18104x89d4ce9e() == null) ? new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzv(mo18110xa33d199d(), mo17563x572a11ff(), false, 4225, mo18112x7af9cfc8()) : new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzv(m18099x76847179().getPackageName(), m18104x89d4ce9e(), true, 4225, false);
                this.zza = zzvVar2;
                if (zzvVar2.zzc() && mo17560x352ce358() < 17895000) {
                    throw new java.lang.IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(java.lang.String.valueOf(this.zza.zzb())));
                }
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1911x7fb283e0 abstractC1911x7fb283e03 = this.zzn;
                java.lang.String zzb3 = this.zza.zzb();
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(zzb3);
                if (!abstractC1911x7fb283e03.zzc(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzo(zzb3, this.zza.zza(), 4225, this.zza.zzc()), zzeVar3, zze(), mo18097xea6d75())) {
                    this.zza.zzb();
                    this.zza.zza();
                    zzl(16, null, this.zzd.get());
                }
            } else if (i17 == 4) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(iInterface);
                m18116xb7f23794(iInterface);
            }
        }
    }

    /* renamed from: checkAvailabilityAndConnect */
    public void m18088x3744fdf6() {
        int mo17631x402556f4 = this.zzo.mo17631x402556f4(this.zzl, mo17560x352ce358());
        if (mo17631x402556f4 == 0) {
            mo17707x38b478ea(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.LegacyClientCallbackAdapter());
        } else {
            zzp(1, null);
            m18124xefed530e(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.LegacyClientCallbackAdapter(), mo17631x402556f4, null);
        }
    }

    /* renamed from: checkConnected */
    public final void m18089x4b2556e1() {
        if (!m18114x23b734ff()) {
            throw new java.lang.IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* renamed from: connect */
    public void mo17707x38b478ea(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzc = connectionProgressReportCallbacks;
        zzp(2, null);
    }

    /* renamed from: createServiceInterface */
    public abstract T mo17559xa50fef20(android.os.IBinder iBinder);

    /* renamed from: disconnect */
    public void m18090x1f9d589c() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            int size = this.zzt.size();
            for (int i17 = 0; i17 < size; i17++) {
                ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzc) this.zzt.get(i17)).zzf();
            }
            this.zzt.clear();
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    /* renamed from: dump */
    public void m18092x2f39f4(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        int i17;
        android.os.IInterface iInterface;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1917xe04b660a interfaceC1917xe04b660a;
        synchronized (this.zzp) {
            i17 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            interfaceC1917xe04b660a = this.zzr;
        }
        printWriter.append((java.lang.CharSequence) str).append("mConnectState=");
        if (i17 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i17 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i17 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i17 == 4) {
            printWriter.print("CONNECTED");
        } else if (i17 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((java.lang.CharSequence) mo17561x83e1df4e()).append("@").append((java.lang.CharSequence) java.lang.Integer.toHexString(java.lang.System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC1917xe04b660a == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(java.lang.Integer.toHexString(java.lang.System.identityHashCode(interfaceC1917xe04b660a.asBinder())));
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.US);
        if (this.zzh > 0) {
            java.io.PrintWriter append = printWriter.append((java.lang.CharSequence) str).append("lastConnectedTime=");
            long j17 = this.zzh;
            append.println(j17 + " " + simpleDateFormat.format(new java.util.Date(j17)));
        }
        if (this.zzg > 0) {
            printWriter.append((java.lang.CharSequence) str).append("lastSuspendedCause=");
            int i18 = this.zzf;
            if (i18 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i18 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i18 != 3) {
                printWriter.append((java.lang.CharSequence) java.lang.String.valueOf(i18));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            java.io.PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j18 = this.zzg;
            append2.println(j18 + " " + simpleDateFormat.format(new java.util.Date(j18)));
        }
        if (this.zzj > 0) {
            printWriter.append((java.lang.CharSequence) str).append("lastFailedStatus=").append((java.lang.CharSequence) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1744x3e726449.m17735x30a6166(this.zzi));
            java.io.PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j19 = this.zzj;
            append3.println(j19 + " " + simpleDateFormat.format(new java.util.Date(j19)));
        }
    }

    /* renamed from: enableLocalFallback */
    public boolean m18093x9177a6aa() {
        return false;
    }

    /* renamed from: getAccount */
    public android.accounts.Account mo18094xf7a0c5f7() {
        return null;
    }

    /* renamed from: getApiFeatures */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] mo18095xe7384f41() {
        return zze;
    }

    /* renamed from: getAvailableFeatures */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] m18096x968e8170() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzk zzkVar = this.zzD;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.zzb;
    }

    /* renamed from: getBindServiceExecutor */
    public java.util.concurrent.Executor mo18097xea6d75() {
        return null;
    }

    /* renamed from: getConnectionHint */
    public android.os.Bundle m18098x3a47ff7b() {
        return null;
    }

    /* renamed from: getContext */
    public final android.content.Context m18099x76847179() {
        return this.zzl;
    }

    /* renamed from: getEndpointPackageName */
    public java.lang.String m18100x51be17e6() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzv zzvVar;
        if (!m18114x23b734ff() || (zzvVar = this.zza) == null) {
            throw new java.lang.RuntimeException("Failed to connect when checking package");
        }
        return zzvVar.zza();
    }

    /* renamed from: getGCoreServiceId */
    public int m18101xabd5a5a0() {
        return this.zzy;
    }

    /* renamed from: getGetServiceRequestExtraArgs */
    public android.os.Bundle mo18102x97bc63d3() {
        return new android.os.Bundle();
    }

    /* renamed from: getLastDisconnectMessage */
    public java.lang.String m18103x5778d61f() {
        return this.zzk;
    }

    /* renamed from: getLocalStartServiceAction */
    public java.lang.String m18104x89d4ce9e() {
        return null;
    }

    /* renamed from: getLooper */
    public final android.os.Looper m18105x23b2dd47() {
        return this.zzm;
    }

    /* renamed from: getMinApkVersion */
    public int mo17560x352ce358() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a.f5827x7aedca50;
    }

    /* renamed from: getRemoteService */
    public void m18106x525c67d9(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1914xc5c6680b interfaceC1914xc5c6680b, java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> set) {
        android.os.Bundle mo18102x97bc63d3 = mo18102x97bc63d3();
        java.lang.String str = this.zzA;
        int i17 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a.f5827x7aedca50;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34[] c1762x4c04e34Arr = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1909xa129caf0.zza;
        android.os.Bundle bundle = new android.os.Bundle();
        int i18 = this.zzy;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] c1702x28db12d6Arr = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1909xa129caf0.zzb;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1909xa129caf0 c1909xa129caf0 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1909xa129caf0(6, i18, i17, null, null, c1762x4c04e34Arr, bundle, null, c1702x28db12d6Arr, c1702x28db12d6Arr, true, 0, false, str);
        c1909xa129caf0.zzf = this.zzl.getPackageName();
        c1909xa129caf0.zzi = mo18102x97bc63d3;
        if (set != null) {
            c1909xa129caf0.zzh = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34[]) set.toArray(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34[0]);
        }
        if (mo17723xabdb8910()) {
            android.accounts.Account mo18094xf7a0c5f7 = mo18094xf7a0c5f7();
            if (mo18094xf7a0c5f7 == null) {
                mo18094xf7a0c5f7 = new android.accounts.Account("<<default account>>", "com.google");
            }
            c1909xa129caf0.zzj = mo18094xf7a0c5f7;
            if (interfaceC1914xc5c6680b != null) {
                c1909xa129caf0.zzg = interfaceC1914xc5c6680b.asBinder();
            }
        } else if (m18121xcf1169f()) {
            c1909xa129caf0.zzj = mo18094xf7a0c5f7();
        }
        c1909xa129caf0.zzk = zze;
        c1909xa129caf0.zzl = mo18095xe7384f41();
        if (mo18125x70459ec2()) {
            c1909xa129caf0.zzo = true;
        }
        try {
            try {
                synchronized (this.zzq) {
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1917xe04b660a interfaceC1917xe04b660a = this.zzr;
                    if (interfaceC1917xe04b660a != null) {
                        interfaceC1917xe04b660a.mo18183xb411027f(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzd(this, this.zzd.get()), c1909xa129caf0);
                    }
                }
            } catch (android.os.RemoteException | java.lang.RuntimeException unused) {
                mo18119x66ce737b(8, null, null, this.zzd.get());
            }
        } catch (android.os.DeadObjectException unused2) {
            m18123x70016fc5(3);
        } catch (java.lang.SecurityException e17) {
            throw e17;
        }
    }

    /* renamed from: getScopes */
    public java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> mo18107x2efbaf95() {
        return java.util.Collections.emptySet();
    }

    /* renamed from: getService */
    public final T m18108xb411027f() {
        T t17;
        synchronized (this.zzp) {
            if (this.zzv == 5) {
                throw new android.os.DeadObjectException();
            }
            m18089x4b2556e1();
            t17 = (T) this.zzs;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(t17, "Client is connected but service is null");
        }
        return t17;
    }

    /* renamed from: getServiceBrokerBinder */
    public android.os.IBinder m18109xaaad0302() {
        synchronized (this.zzq) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1917xe04b660a interfaceC1917xe04b660a = this.zzr;
            if (interfaceC1917xe04b660a == null) {
                return null;
            }
            return interfaceC1917xe04b660a.asBinder();
        }
    }

    /* renamed from: getServiceDescriptor */
    public abstract java.lang.String mo17561x83e1df4e();

    /* renamed from: getSignInIntent */
    public android.content.Intent mo17562xc37ac774() {
        throw new java.lang.UnsupportedOperationException("Not a sign in API");
    }

    /* renamed from: getStartServiceAction */
    public abstract java.lang.String mo17563x572a11ff();

    /* renamed from: getStartServicePackage */
    public java.lang.String mo18110xa33d199d() {
        return "com.google.android.gms";
    }

    /* renamed from: getTelemetryConfiguration */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1905x3d7caa5b m18111x56d58cb3() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzk zzkVar = this.zzD;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.zzd;
    }

    /* renamed from: getUseDynamicLookup */
    public boolean mo18112x7af9cfc8() {
        return mo17560x352ce358() >= 211700000;
    }

    /* renamed from: hasConnectionInfo */
    public boolean m18113xaacf81e6() {
        return this.zzD != null;
    }

    /* renamed from: isConnected */
    public boolean m18114x23b734ff() {
        boolean z17;
        synchronized (this.zzp) {
            z17 = this.zzv == 4;
        }
        return z17;
    }

    /* renamed from: isConnecting */
    public boolean m18115x532f7b82() {
        boolean z17;
        synchronized (this.zzp) {
            int i17 = this.zzv;
            z17 = true;
            if (i17 != 2 && i17 != 3) {
                z17 = false;
            }
        }
        return z17;
    }

    /* renamed from: onConnectedLocked */
    public void m18116xb7f23794(T t17) {
        this.zzh = java.lang.System.currentTimeMillis();
    }

    /* renamed from: onConnectionFailed */
    public void m18117xce9394ba(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        this.zzi = c1700xff0c58bb.m17600x130a215f();
        this.zzj = java.lang.System.currentTimeMillis();
    }

    /* renamed from: onConnectionSuspended */
    public void m18118x4511603e(int i17) {
        this.zzf = i17;
        this.zzg = java.lang.System.currentTimeMillis();
    }

    /* renamed from: onPostInitHandler */
    public void mo18119x66ce737b(int i17, android.os.IBinder iBinder, android.os.Bundle bundle, int i18) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i18, -1, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzf(this, i17, iBinder, bundle)));
    }

    /* renamed from: onUserSignOut */
    public void m18120x87088ea7(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.mo17964x98c228cb();
    }

    /* renamed from: providesSignIn */
    public boolean mo17564x6e8aa054() {
        return false;
    }

    /* renamed from: requiresAccount */
    public boolean m18121xcf1169f() {
        return false;
    }

    /* renamed from: requiresGooglePlayServices */
    public boolean mo17722xb7ac48d9() {
        return true;
    }

    /* renamed from: requiresSignIn */
    public boolean mo17723xabdb8910() {
        return false;
    }

    /* renamed from: setAttributionTag */
    public void m18122x4957a79d(java.lang.String str) {
        this.zzA = str;
    }

    /* renamed from: triggerConnectionSuspended */
    public void m18123x70016fc5(int i17) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i17));
    }

    /* renamed from: triggerNotAvailable */
    public void m18124xefed530e(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i17, android.app.PendingIntent pendingIntent) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzc = connectionProgressReportCallbacks;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i17, pendingIntent));
    }

    /* renamed from: usesClientTelemetry */
    public boolean mo18125x70459ec2() {
        return false;
    }

    public final java.lang.String zze() {
        java.lang.String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzl(int i17, android.os.Bundle bundle, int i18) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i18, -1, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzg(this, i17, null)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC1900x418ca687(android.content.Context r10, android.os.Looper r11, int r12, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.BaseConnectionCallbacks r13, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.BaseOnConnectionFailedListener r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1911x7fb283e0.m18165x9cf0d20b(r10)
            com.google.android.gms.common.GoogleApiAvailabilityLight r4 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a.m17641x9cf0d20b()
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(r13)
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener, java.lang.String):void");
    }

    /* renamed from: disconnect */
    public void m18091x1f9d589c(java.lang.String str) {
        this.zzk = str;
        m18090x1f9d589c();
    }

    public AbstractC1900x418ca687(android.content.Context context, android.os.Looper looper, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1911x7fb283e0 abstractC1911x7fb283e0, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a c1706xe937257a, int i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.BaseConnectionCallbacks baseConnectionCallbacks, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.BaseOnConnectionFailedListener baseOnConnectionFailedListener, java.lang.String str) {
        this.zzk = null;
        this.zzp = new java.lang.Object();
        this.zzq = new java.lang.Object();
        this.zzt = new java.util.ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new java.util.concurrent.atomic.AtomicInteger(0);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(context, "Context must not be null");
        this.zzl = context;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(looper, "Looper must not be null");
        this.zzm = looper;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(abstractC1911x7fb283e0, "Supervisor must not be null");
        this.zzn = abstractC1911x7fb283e0;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(c1706xe937257a, "API availability must not be null");
        this.zzo = c1706xe937257a;
        this.zzb = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzb(this, looper);
        this.zzy = i17;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = str;
    }
}
