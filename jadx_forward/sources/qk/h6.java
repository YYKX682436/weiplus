package qk;

/* loaded from: classes8.dex */
public class h6 extends dm.h5 implements l23.a {

    /* renamed from: p1, reason: collision with root package name */
    public static final l75.e0 f445683p1 = dm.h5.m125027x3593deb(qk.h6.class);

    /* renamed from: equals */
    public boolean m160335xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof qk.h6)) {
            return false;
        }
        qk.h6 h6Var = (qk.h6) obj;
        return h6Var.f66769xf47740ff.equals(this.f66769xf47740ff) && h6Var.f72763xa3c65b86 == this.f72763xa3c65b86;
    }

    @Override // dm.h5, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f445683p1;
    }

    /* renamed from: hashCode */
    public int m160336x8cdac1b() {
        return this.f66769xf47740ff.hashCode();
    }

    public java.util.LinkedList t0() {
        r45.l4 l4Var = this.f66760x3019ab0e;
        return l4Var == null ? new java.util.LinkedList() : l4Var.f460654d;
    }

    /* renamed from: toString */
    public java.lang.String m160337x9616526c() {
        java.lang.String str;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f66762x4b6e43c0)) {
            java.lang.String[] split = this.f66762x4b6e43c0.split("/");
            if (split.length > 0) {
                str = split[split.length - 1];
                return "FunctionMsgItem{cgi='" + str + "', cmdid=" + this.f66763x28ef0850 + ", functionmsgid='" + this.f66769xf47740ff + "', version=" + this.f66779x8987ca93 + ", preVersion=" + this.f66772x13c6891a + ", status=" + this.f66777x10a0fed7 + ", actionTime=" + this.f66758x27886e88 + ", delayTime=" + this.f66766x7ea831eb + ", retryCount=" + this.f66774x73c8dbac + ", retryCountLimit=" + this.f66775x8869eb6f + '}';
            }
        }
        str = "@null";
        return "FunctionMsgItem{cgi='" + str + "', cmdid=" + this.f66763x28ef0850 + ", functionmsgid='" + this.f66769xf47740ff + "', version=" + this.f66779x8987ca93 + ", preVersion=" + this.f66772x13c6891a + ", status=" + this.f66777x10a0fed7 + ", actionTime=" + this.f66758x27886e88 + ", delayTime=" + this.f66766x7ea831eb + ", retryCount=" + this.f66774x73c8dbac + ", retryCountLimit=" + this.f66775x8869eb6f + '}';
    }
}
