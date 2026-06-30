package com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b;

/* renamed from: com.tencent.wechat.zidl2.TaskIdConvertor */
/* loaded from: classes15.dex */
public class C27690xb1a52116 {
    private static final java.lang.String TAG = "TaskIdConvertor";

    /* renamed from: clientToServerIdMap */
    private java.util.concurrent.ConcurrentHashMap<com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27690xb1a52116.ClientIdContext, java.lang.Long> f60623x4d688538 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: serverToClientIdMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27690xb1a52116.ClientIdContext> f60624xcf247d38 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: taskId */
    private java.util.concurrent.atomic.AtomicLong f60625xcb7ef180 = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: com.tencent.wechat.zidl2.TaskIdConvertor$ClientIdContext */
    /* loaded from: classes15.dex */
    public class ClientIdContext {

        /* renamed from: clientId */
        private java.lang.String f60626x36253646;

        /* renamed from: taskId */
        private long f60627xcb7ef180;

        public ClientIdContext(java.lang.String str, long j17) {
            this.f60626x36253646 = str;
            this.f60627xcb7ef180 = j17;
        }

        /* renamed from: equals */
        public boolean m119532xb2c87fbf(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27690xb1a52116.ClientIdContext)) {
                return false;
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27690xb1a52116.ClientIdContext clientIdContext = (com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27690xb1a52116.ClientIdContext) obj;
            return this.f60627xcb7ef180 == clientIdContext.f60627xcb7ef180 && java.util.Objects.equals(this.f60626x36253646, clientIdContext.f60626x36253646);
        }

        /* renamed from: getClientId */
        public java.lang.String m119533xb1ff73bc() {
            return this.f60626x36253646;
        }

        /* renamed from: getTaskId */
        public long m119534x30961476() {
            return this.f60627xcb7ef180;
        }

        /* renamed from: hashCode */
        public int m119535x8cdac1b() {
            return java.util.Objects.hash(this.f60626x36253646, java.lang.Long.valueOf(this.f60627xcb7ef180));
        }
    }

    /* renamed from: GenTaskId */
    public long m119528x6aa2d0d0() {
        return this.f60625xcb7ef180.incrementAndGet();
    }

    /* renamed from: removeServerId */
    public void m119529xf32a0c62(long j17) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27690xb1a52116.ClientIdContext clientIdContext = this.f60624xcf247d38.get(java.lang.Long.valueOf(j17));
        if (clientIdContext == null) {
            return;
        }
        this.f60623x4d688538.remove(java.lang.Long.valueOf(j17));
        this.f60624xcf247d38.remove(clientIdContext);
    }

    /* renamed from: toClientId */
    public com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27690xb1a52116.ClientIdContext m119530x34f2fde1(long j17) {
        return this.f60624xcf247d38.get(java.lang.Long.valueOf(j17));
    }

    /* renamed from: toServerId */
    public long m119531x51013b59(java.lang.String str, long j17) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27690xb1a52116.ClientIdContext clientIdContext = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27690xb1a52116.ClientIdContext(str, j17);
        java.lang.Long l17 = this.f60623x4d688538.get(clientIdContext);
        if (l17 != null) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.d(hw5.a.WARN, TAG, java.lang.String.format("ToServerId failed %s %d", str, java.lang.Long.valueOf(j17)), new java.lang.Object[0]);
            return l17.longValue();
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(m119528x6aa2d0d0());
        this.f60623x4d688538.put(clientIdContext, valueOf);
        this.f60624xcf247d38.put(valueOf, clientIdContext);
        return valueOf.longValue();
    }
}
