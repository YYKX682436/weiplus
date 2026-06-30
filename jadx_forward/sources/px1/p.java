package px1;

/* loaded from: classes12.dex */
public enum p {
    NONE("", "", "", "", false, false),
    NOTEUL("<wx-ul>", "</wx-ul>", "<wx-li>", "</wx-li>", false, true),
    NOTEOL("<wx-ol>", "</wx-ol>", "<wx-li>", "</wx-li>", false, true),
    NOTETODO("", "", "<wn-todo checked=\"1\" >", "</wn-todo>", false, true);


    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f440374d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f440375e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f440376f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f440377g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f440378h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f440379i = false;

    p(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, boolean z18) {
        this.f440374d = str;
        this.f440375e = str2;
        this.f440376f = str3;
        this.f440377g = str4;
        this.f440378h = z18;
    }

    public boolean h() {
        return this == NOTETODO;
    }
}
