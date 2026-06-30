package bz0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f118272a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f118273b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f118274c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f118275d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f118276e;

    public g(java.lang.String tmplId, java.lang.String forSearchWording, java.util.List exposeMusicIdList, java.util.List exposeMusicNameList, java.util.List clickedMusicIdList, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        exposeMusicIdList = (i17 & 4) != 0 ? new java.util.ArrayList() : exposeMusicIdList;
        exposeMusicNameList = (i17 & 8) != 0 ? new java.util.ArrayList() : exposeMusicNameList;
        clickedMusicIdList = (i17 & 16) != 0 ? new java.util.ArrayList() : clickedMusicIdList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tmplId, "tmplId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forSearchWording, "forSearchWording");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposeMusicIdList, "exposeMusicIdList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposeMusicNameList, "exposeMusicNameList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickedMusicIdList, "clickedMusicIdList");
        this.f118272a = tmplId;
        this.f118273b = forSearchWording;
        this.f118274c = exposeMusicIdList;
        this.f118275d = exposeMusicNameList;
        this.f118276e = clickedMusicIdList;
    }
}
