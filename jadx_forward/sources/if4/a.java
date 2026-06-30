package if4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public long f372767b;

    /* renamed from: c, reason: collision with root package name */
    public int f372768c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f372769d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f372770e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f372771f;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f372766a = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f372772g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f372773h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f372774i = new java.util.LinkedList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.LinkedList f372775j = new java.util.LinkedList();

    /* renamed from: equals */
    public boolean m135223xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof if4.a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if4.a aVar = (if4.a) obj;
        return this.f372767b == aVar.f372767b && this.f372772g.size() == aVar.f372772g.size() && this.f372770e == aVar.f372770e && this.f372769d == aVar.f372769d;
    }

    /* renamed from: toString */
    public java.lang.String m135224x9616526c() {
        return "StoryGalleryComment(fromUser='" + this.f372766a + "', storyId=" + this.f372767b + ", commentType=" + this.f372768c + ", commentUser=null, isUnread=" + this.f372770e + ", commentList=" + this.f372772g + ')';
    }
}
