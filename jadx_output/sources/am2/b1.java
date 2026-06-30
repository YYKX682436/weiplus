package am2;

/* loaded from: classes3.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8632a;

    /* renamed from: d, reason: collision with root package name */
    public long f8635d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f8636e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8637f;

    /* renamed from: b, reason: collision with root package name */
    public am2.h3 f8633b = am2.h3.f8681d;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f8634c = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f8638g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f8639h = "";

    public b1(int i17) {
        this.f8632a = i17;
    }

    public final com.tencent.mm.plugin.finder.live.util.l1 a() {
        java.lang.String str;
        r45.cj1 cj1Var = new r45.cj1();
        com.tencent.mm.plugin.finder.live.util.m1 m1Var = com.tencent.mm.plugin.finder.live.util.m1.f115626n;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f8634c)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            am2.z0 z0Var = (am2.z0) am2.e1.f8659c.get(this.f8633b);
            sb6.append(z0Var != null ? z0Var.f8780b : null);
            sb6.append('_');
            sb6.append(java.util.UUID.randomUUID());
            str = sb6.toString();
        } else {
            str = this.f8634c;
        }
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(13, new r45.xn1());
        r45.xn1 xn1Var = (r45.xn1) ch1Var.getCustom(13);
        boolean z17 = false;
        if (xn1Var != null) {
            xn1Var.set(0, new com.tencent.mm.protocal.protobuf.FinderContact());
        }
        r45.xn1 xn1Var2 = (r45.xn1) ch1Var.getCustom(13);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = xn1Var2 != null ? (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0) : null;
        if (finderContact != null) {
            java.lang.String str2 = this.f8636e;
            if (str2 == null) {
                str2 = "测试" + c06.e.f37716d.c();
            }
            finderContact.setNickname(str2);
        }
        r45.xn1 xn1Var3 = (r45.xn1) ch1Var.getCustom(13);
        if (xn1Var3 != null) {
            gk2.e eVar = gk2.e.f272471n;
            xn1Var3.set(11, eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).f328812h : null);
        }
        ch1Var.set(2, this.f8639h);
        java.util.HashMap hashMap = am2.e1.f8659c;
        am2.z0 z0Var2 = (am2.z0) hashMap.get(this.f8633b);
        cj1Var.set(0, z0Var2 != null ? z0Var2.f8779a : null);
        com.tencent.mm.plugin.finder.live.util.l1 l1Var = new com.tencent.mm.plugin.finder.live.util.l1(ch1Var);
        l1Var.f115590e = m1Var;
        l1Var.f115592g = cj1Var;
        l1Var.f115593h = str;
        l1Var.f115594i = 0;
        l1Var.f115595m = this.f8632a;
        l1Var.f115596n = kz5.z.G(am2.e1.f8658b, this.f8633b) ? "PRECIOUS_GIFT_SCHEDULE_NORMAL" : "PRECIOUS_GIFT_SCHEDULE_NONE";
        l1Var.f115599q = this.f8637f;
        am2.z0 z0Var3 = (am2.z0) hashMap.get(this.f8633b);
        l1Var.f115600r = z0Var3 != null ? z0Var3.f8779a : null;
        java.lang.String str3 = this.f8638g;
        kotlin.jvm.internal.o.g(str3, "<set-?>");
        l1Var.f115601s = str3;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (l1Var.f115594i > 1 || l1Var.f115595m > 1)) {
            z17 = true;
        }
        if (this.f8637f) {
            m1Var = (kotlin.jvm.internal.o.b(l1Var.f115596n, "PRECIOUS_GIFT_SCHEDULE_NORMAL") || kotlin.jvm.internal.o.b(l1Var.f115596n, "PRECIOUS_GIFT_SCHEDULE_AS_ATTACH_GIFT")) ? z17 ? com.tencent.mm.plugin.finder.live.util.m1.f115619d : com.tencent.mm.plugin.finder.live.util.m1.f115620e : z17 ? com.tencent.mm.plugin.finder.live.util.m1.f115621f : com.tencent.mm.plugin.finder.live.util.m1.f115622g;
        } else if (kotlin.jvm.internal.o.b(l1Var.f115596n, "PRECIOUS_GIFT_SCHEDULE_NORMAL") || kotlin.jvm.internal.o.b(l1Var.f115596n, "PRECIOUS_GIFT_SCHEDULE_AS_ATTACH_GIFT")) {
            m1Var = z17 ? com.tencent.mm.plugin.finder.live.util.m1.f115623h : com.tencent.mm.plugin.finder.live.util.m1.f115624i;
        } else if (z17) {
            m1Var = com.tencent.mm.plugin.finder.live.util.m1.f115625m;
        }
        l1Var.f115590e = m1Var;
        return l1Var;
    }

    public final am2.b1 b(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f8639h = str;
        return this;
    }

    public final am2.b1 c(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f8638g = str;
        return this;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("giftName = ");
        dk2.u7 u7Var = dk2.u7.f234181a;
        java.util.Map map = dk2.u7.f234185e;
        am2.e1 e1Var = am2.e1.f8657a;
        java.util.HashMap hashMap = am2.e1.f8659c;
        am2.z0 z0Var = (am2.z0) hashMap.get(this.f8633b);
        ce2.i iVar = (ce2.i) map.get(z0Var != null ? z0Var.f8779a : null);
        sb7.append(iVar != null ? iVar.field_name : null);
        sb6.append(sb7.toString());
        sb6.append(", ");
        sb6.append("comboId = " + this.f8634c);
        sb6.append(", ");
        sb6.append("count = " + this.f8632a);
        sb6.append(", executeInMainThread = false, ");
        sb6.append("nickname = " + this.f8636e + " ,");
        sb6.append("isSelfSend = " + this.f8637f + " ,");
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("giftLocalName = ");
        am2.z0 z0Var2 = (am2.z0) hashMap.get(this.f8633b);
        sb8.append(z0Var2 != null ? z0Var2.f8780b : null);
        sb8.append(", ");
        sb6.append(sb8.toString());
        sb6.append("executeDelayMs = " + this.f8635d);
        sb6.append(", ");
        sb6.append("targetUserName = " + this.f8638g);
        sb6.append("\n");
        java.lang.String sb9 = sb6.toString();
        kotlin.jvm.internal.o.f(sb9, "toString(...)");
        return sb9;
    }
}
