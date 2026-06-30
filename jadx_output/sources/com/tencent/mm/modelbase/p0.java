package com.tencent.mm.modelbase;

/* loaded from: classes11.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.j4 f70726a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f70727b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f70728c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f70729d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f70730e;

    /* renamed from: f, reason: collision with root package name */
    public final long f70731f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f70732g;

    /* renamed from: h, reason: collision with root package name */
    public int f70733h;

    public p0(r45.j4 j4Var, boolean z17, boolean z18, boolean z19) {
        this.f70727b = false;
        this.f70728c = false;
        this.f70729d = false;
        this.f70730e = false;
        this.f70731f = 0L;
        this.f70726a = j4Var;
        this.f70727b = z17;
        this.f70728c = z18;
        this.f70729d = z19;
    }

    public java.lang.String toString() {
        return java.lang.String.format("AddMsgInfo(%d), get[%b], fault[%b], up[%b] fixTime[%s]", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(this.f70727b), java.lang.Boolean.valueOf(this.f70728c), java.lang.Boolean.valueOf(this.f70729d), java.lang.Long.valueOf(this.f70731f));
    }

    public p0(r45.j4 j4Var, boolean z17, boolean z18, boolean z19, long j17) {
        this.f70727b = false;
        this.f70728c = false;
        this.f70729d = false;
        this.f70730e = false;
        this.f70731f = 0L;
        this.f70726a = j4Var;
        this.f70727b = z17;
        this.f70728c = z18;
        this.f70729d = z19;
        this.f70731f = j17;
    }

    public p0(r45.j4 j4Var, java.lang.Object obj) {
        this.f70727b = false;
        this.f70728c = false;
        this.f70729d = false;
        this.f70730e = false;
        this.f70731f = 0L;
        this.f70726a = j4Var;
        this.f70732g = obj;
    }

    public p0(r45.j4 j4Var, boolean z17, java.lang.Object obj) {
        this.f70727b = false;
        this.f70728c = false;
        this.f70729d = false;
        this.f70730e = false;
        this.f70731f = 0L;
        this.f70726a = j4Var;
        this.f70732g = obj;
    }

    public p0(r45.j4 j4Var, boolean z17, long j17) {
        this.f70727b = false;
        this.f70728c = false;
        this.f70729d = false;
        this.f70730e = false;
        this.f70731f = 0L;
        this.f70726a = j4Var;
        this.f70730e = z17;
        this.f70731f = j17;
    }
}
