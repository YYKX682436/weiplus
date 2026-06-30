package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f99664a = false;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.ui.p0 f99665b = com.tencent.mm.plugin.exdevice.ui.p0.CONNECT_PROTO_TYPE_WIFI;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.ui.q0 f99666c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.ui.r0 f99667d;

    /* renamed from: e, reason: collision with root package name */
    public r45.nv3 f99668e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ov3 f99669f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f99670g;

    /* renamed from: h, reason: collision with root package name */
    public r45.tn4 f99671h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f99672i;

    public t0(com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI exdeviceBindDeviceUI, com.tencent.mm.plugin.exdevice.ui.d0 d0Var) {
    }

    public java.lang.String a() {
        if (this.f99665b != com.tencent.mm.plugin.exdevice.ui.p0.CONNECT_PROTO_TYPE_WIFI) {
            return this.f99666c.f99626b;
        }
        r45.ov3 ov3Var = this.f99669f;
        if (ov3Var == null) {
            return null;
        }
        return ov3Var.f382540f;
    }

    public java.lang.String b() {
        if (this.f99665b != com.tencent.mm.plugin.exdevice.ui.p0.CONNECT_PROTO_TYPE_WIFI) {
            return this.f99666c.f99626b;
        }
        return this.f99667d.f99636a + this.f99667d.f99637b;
    }
}
