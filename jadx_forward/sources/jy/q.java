package jy;

/* loaded from: classes14.dex */
public final class q implements jy.s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f384009a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f384010b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f384011c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f384012d;

    public q(java.lang.String str, java.lang.String str2, boolean z17, boolean z18) {
        this.f384009a = str;
        this.f384010b = str2;
        this.f384011c = z17;
        this.f384012d = z18;
    }

    public static jy.q a(jy.q qVar, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = qVar.f384009a;
        }
        if ((i17 & 2) != 0) {
            str2 = qVar.f384010b;
        }
        if ((i17 & 4) != 0) {
            z17 = qVar.f384011c;
        }
        if ((i17 & 8) != 0) {
            z18 = qVar.f384012d;
        }
        qVar.getClass();
        return new jy.q(str, str2, z17, z18);
    }

    /* renamed from: equals */
    public boolean m141496xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy.q)) {
            return false;
        }
        jy.q qVar = (jy.q) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f384009a, qVar.f384009a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f384010b, qVar.f384010b) && this.f384011c == qVar.f384011c && this.f384012d == qVar.f384012d;
    }

    /* renamed from: hashCode */
    public int m141497x8cdac1b() {
        java.lang.String str = this.f384009a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f384010b;
        return ((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f384011c)) * 31) + java.lang.Boolean.hashCode(this.f384012d);
    }

    /* renamed from: toString */
    public java.lang.String m141498x9616526c() {
        return "ScreenState(headImageUrl=" + this.f384009a + ", roomName=" + this.f384010b + ", ttsBegin=" + this.f384011c + ", aiJoinRoomSuccess=" + this.f384012d + ')';
    }
}
