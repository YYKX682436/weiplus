package wp0;

/* loaded from: classes5.dex */
public final class b extends wp0.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f529896a;

    /* renamed from: b, reason: collision with root package name */
    public final long f529897b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f529898c;

    /* renamed from: d, reason: collision with root package name */
    public final long f529899d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.RectF f529900e;

    /* renamed from: f, reason: collision with root package name */
    public final long f529901f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f529902g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f529903h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f529904i;

    /* renamed from: j, reason: collision with root package name */
    public final int f529905j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f529906k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f529907l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String id6, long j17, java.lang.String emojiKey, long j18, android.graphics.RectF frame, long j19, boolean z17, java.lang.String fromUserName, java.lang.String toUserName, int i17, java.lang.String content, java.lang.String ext) {
        super(id6, frame, j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiKey, "emojiKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frame, "frame");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUserName, "fromUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUserName, "toUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        this.f529896a = id6;
        this.f529897b = j17;
        this.f529898c = emojiKey;
        this.f529899d = j18;
        this.f529900e = frame;
        this.f529901f = j19;
        this.f529902g = z17;
        this.f529903h = fromUserName;
        this.f529904i = toUserName;
        this.f529905j = i17;
        this.f529906k = content;
        this.f529907l = ext;
    }

    public final java.lang.String a(int i17, java.lang.String session) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.HashMap hashMap = new java.util.HashMap(16);
        hashMap.put("msgId", java.lang.Long.valueOf(this.f529901f));
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(i17));
        hashMap.put("msgMeta", b());
        hashMap.put("sentTime", java.lang.Long.valueOf(currentTimeMillis));
        java.util.HashMap hashMap2 = new java.util.HashMap(3);
        hashMap2.put("sessionID", session);
        hashMap2.put("toChatName", this.f529904i);
        hashMap2.put("messageTimestamp", java.lang.Long.valueOf(currentTimeMillis));
        hashMap.put("reportInfo", hashMap2);
        nf.f.c(hashMap);
        java.lang.String gVar = new cl0.g(hashMap).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
        return gVar;
    }

    public final java.util.Map b() {
        java.util.HashMap hashMap = new java.util.HashMap(12);
        hashMap.put("msgId", java.lang.Long.valueOf(this.f529901f));
        hashMap.put("ID", this.f529896a);
        hashMap.put("isFrom", java.lang.Boolean.valueOf(this.f529902g));
        hashMap.put("msgType", java.lang.Long.valueOf(this.f529899d));
        hashMap.put("content", this.f529906k);
        hashMap.put("emojiKey", this.f529898c);
        hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(this.f529897b));
        hashMap.put("fromUserName", this.f529903h);
        hashMap.put("toUserName", this.f529904i);
        hashMap.put("emojiConfigVersion", java.lang.Integer.valueOf(this.f529905j));
        hashMap.put("ext", this.f529907l);
        hashMap.put("frame", cq0.a.f302858a.b(this.f529900e));
        return hashMap;
    }

    /* renamed from: equals */
    public boolean m174288xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp0.b)) {
            return false;
        }
        wp0.b bVar = (wp0.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f529896a, bVar.f529896a) && this.f529897b == bVar.f529897b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f529898c, bVar.f529898c) && this.f529899d == bVar.f529899d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f529900e, bVar.f529900e) && this.f529901f == bVar.f529901f && this.f529902g == bVar.f529902g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f529903h, bVar.f529903h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f529904i, bVar.f529904i) && this.f529905j == bVar.f529905j && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f529906k, bVar.f529906k) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f529907l, bVar.f529907l);
    }

    /* renamed from: hashCode */
    public int m174289x8cdac1b() {
        return (((((((((((((((((((((this.f529896a.hashCode() * 31) + java.lang.Long.hashCode(this.f529897b)) * 31) + this.f529898c.hashCode()) * 31) + java.lang.Long.hashCode(this.f529899d)) * 31) + this.f529900e.hashCode()) * 31) + java.lang.Long.hashCode(this.f529901f)) * 31) + java.lang.Boolean.hashCode(this.f529902g)) * 31) + this.f529903h.hashCode()) * 31) + this.f529904i.hashCode()) * 31) + java.lang.Integer.hashCode(this.f529905j)) * 31) + this.f529906k.hashCode()) * 31) + this.f529907l.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m174290x9616526c() {
        return "MEMeta(id=" + this.f529896a + ", timestamp=" + this.f529897b + ", emojiKey=" + this.f529898c + ", msgType=" + this.f529899d + ", frame=" + this.f529900e + ", msgId=" + this.f529901f + ", isFrom=" + this.f529902g + ", fromUserName=" + this.f529903h + ", toUserName=" + this.f529904i + ", emojiConfigVersion=" + this.f529905j + ", content=" + this.f529906k + ", ext=" + this.f529907l + ')';
    }
}
