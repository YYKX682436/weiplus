package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/media/GetSightParamsIPCTask;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/plugin/appbrand/jsapi/media/GetSightParamsIPCTask$TaskParams;", "Lcom/tencent/mm/plugin/mmsight/SightParams;", "<init>", "()V", "TaskParams", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.GetSightParamsIPCTask */
/* loaded from: classes10.dex */
public final class C12157x3cff1a94 implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/media/GetSightParamsIPCTask$TaskParams;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/media/o1", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.GetSightParamsIPCTask$TaskParams */
    /* loaded from: classes7.dex */
    public static final /* data */ class TaskParams implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.o1 f34459x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.o1(null);

        /* renamed from: d, reason: collision with root package name */
        public final int f163148d;

        /* renamed from: e, reason: collision with root package name */
        public final int f163149e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f163150f;

        public TaskParams(int i17, int i18, boolean z17) {
            this.f163148d = i17;
            this.f163149e = i18;
            this.f163150f = z17;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: equals */
        public boolean m51038xb2c87fbf(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12157x3cff1a94.TaskParams)) {
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12157x3cff1a94.TaskParams taskParams = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12157x3cff1a94.TaskParams) obj;
            return this.f163148d == taskParams.f163148d && this.f163149e == taskParams.f163149e && this.f163150f == taskParams.f163150f;
        }

        /* renamed from: hashCode */
        public int m51039x8cdac1b() {
            return (((java.lang.Integer.hashCode(this.f163148d) * 31) + java.lang.Integer.hashCode(this.f163149e)) * 31) + java.lang.Boolean.hashCode(this.f163150f);
        }

        /* renamed from: toString */
        public java.lang.String m51040x9616526c() {
            return "TaskParams(sightMode=" + this.f163148d + ", maxDuration=" + this.f163149e + ", isFront=" + this.f163150f + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel dest, int i17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
            dest.writeInt(this.f163148d);
            dest.writeInt(this.f163149e);
            dest.writeByte(this.f163150f ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12157x3cff1a94.TaskParams data = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12157x3cff1a94.TaskParams) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("microMsg_");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = lp0.b.m() + "microMsg." + sb7 + ".mp4";
        java.lang.String str2 = lp0.b.m() + "microMsg." + sb7 + ".jpeg";
        int i17 = data.f163148d;
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 c16528xd9aafd63 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63(3, 2);
            c16528xd9aafd63.f230356m = lp0.b.m();
            c16528xd9aafd63.f230355i = "microMsg." + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
            return c16528xd9aafd63;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 c16528xd9aafd632 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63(3, 1);
        c16528xd9aafd632.f230351e = data.f163150f ? 1 : 2;
        c16528xd9aafd632.f230350d = i17;
        if (c16528xd9aafd632.f230352f == null) {
            c16528xd9aafd632.f230352f = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
        }
        c16528xd9aafd632.f230352f.f152728h = data.f163149e;
        c16528xd9aafd632.f230359p = false;
        c16528xd9aafd632.a(sb7, str, str2, q75.c.d() + "capture" + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG);
        return c16528xd9aafd632;
    }
}
