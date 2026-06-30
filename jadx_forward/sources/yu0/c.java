package yu0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f547314a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f547315b;

    /* renamed from: c, reason: collision with root package name */
    public final yu0.r f547316c;

    public c(java.lang.String groupID, java.lang.String taskID, yu0.r data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupID, "groupID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskID, "taskID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f547314a = groupID;
        this.f547315b = taskID;
        this.f547316c = data;
    }

    /* renamed from: equals */
    public boolean m177661xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0.c)) {
            return false;
        }
        yu0.c cVar = (yu0.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547314a, cVar.f547314a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547315b, cVar.f547315b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547316c, cVar.f547316c);
    }

    /* renamed from: hashCode */
    public int m177662x8cdac1b() {
        return (((this.f547314a.hashCode() * 31) + this.f547315b.hashCode()) * 31) + this.f547316c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m177663x9616526c() {
        return "AudioTask(groupID=" + this.f547314a + ", taskID=" + this.f547315b + ", data=" + this.f547316c + ')';
    }
}
