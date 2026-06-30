package ws5;

/* loaded from: classes3.dex */
public interface f {
    static /* synthetic */ void j(ws5.f fVar, yz5.a aVar, yz5.a aVar2, yz5.p pVar, yz5.l lVar, yz5.a aVar3, yz5.a aVar4, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
        }
        if ((i17 & 1) != 0) {
            aVar = null;
        }
        if ((i17 & 2) != 0) {
            aVar2 = null;
        }
        if ((i17 & 4) != 0) {
            pVar = null;
        }
        if ((i17 & 8) != 0) {
            lVar = null;
        }
        if ((i17 & 16) != 0) {
            aVar3 = null;
        }
        if ((i17 & 32) != 0) {
            aVar4 = null;
        }
        fVar.c(aVar, aVar2, pVar, lVar, aVar3, aVar4);
    }

    android.view.View H();

    void c(yz5.a aVar, yz5.a aVar2, yz5.p pVar, yz5.l lVar, yz5.a aVar3, yz5.a aVar4);

    java.lang.Object e();

    android.view.View f();

    default boolean g() {
        return false;
    }

    /* renamed from: getBindFeedId */
    long mo58373xc51e5ec();

    /* renamed from: getCoverView */
    android.view.View mo58374x756ec046();

    /* renamed from: getLivePlayer */
    java.lang.Object mo58375x1c918ee3();

    /* renamed from: getPlayStatus */
    int mo58377x4c97c83c();

    /* renamed from: getStreamId */
    java.lang.String mo58381xe699b631();

    /* renamed from: getTextureView */
    android.view.TextureView mo58382x3a06c52a();

    /* renamed from: getVideoHeight */
    int mo58383x463504c();

    /* renamed from: getVideoRatioWH */
    float mo58384x92cda997();

    /* renamed from: getVideoWidth */
    int mo58385x8d5c7601();

    default void h(android.graphics.Rect currentRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentRect, "currentRect");
    }

    /* renamed from: isMute */
    boolean mo58386xb9a62e63();

    /* renamed from: isPlaying */
    boolean mo58387xc00617a4();

    boolean k();

    boolean o();

    /* renamed from: pause */
    boolean mo58388x65825f6();

    java.lang.Object q();

    /* renamed from: release */
    void mo58389x41012807();

    /* renamed from: resume */
    void mo58390xc84dc82d();

    /* renamed from: setMute */
    void mo58394x764d819b(boolean z17);

    /* renamed from: stop */
    void mo58404x360802();
}
