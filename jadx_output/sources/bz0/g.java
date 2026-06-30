package bz0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f36739a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f36740b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f36741c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f36742d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f36743e;

    public g(java.lang.String tmplId, java.lang.String forSearchWording, java.util.List exposeMusicIdList, java.util.List exposeMusicNameList, java.util.List clickedMusicIdList, int i17, kotlin.jvm.internal.i iVar) {
        exposeMusicIdList = (i17 & 4) != 0 ? new java.util.ArrayList() : exposeMusicIdList;
        exposeMusicNameList = (i17 & 8) != 0 ? new java.util.ArrayList() : exposeMusicNameList;
        clickedMusicIdList = (i17 & 16) != 0 ? new java.util.ArrayList() : clickedMusicIdList;
        kotlin.jvm.internal.o.g(tmplId, "tmplId");
        kotlin.jvm.internal.o.g(forSearchWording, "forSearchWording");
        kotlin.jvm.internal.o.g(exposeMusicIdList, "exposeMusicIdList");
        kotlin.jvm.internal.o.g(exposeMusicNameList, "exposeMusicNameList");
        kotlin.jvm.internal.o.g(clickedMusicIdList, "clickedMusicIdList");
        this.f36739a = tmplId;
        this.f36740b = forSearchWording;
        this.f36741c = exposeMusicIdList;
        this.f36742d = exposeMusicNameList;
        this.f36743e = clickedMusicIdList;
    }
}
