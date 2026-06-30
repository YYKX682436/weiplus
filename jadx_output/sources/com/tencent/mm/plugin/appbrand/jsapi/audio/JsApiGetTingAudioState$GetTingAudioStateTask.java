package com.tencent.mm.plugin.appbrand.jsapi.audio;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b<\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u0000 ^2\u00020\u0001:\u0001_B\t\b\u0016¢\u0006\u0004\b[\u0010\\B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b[\u0010]J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016R$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\"\u0010%\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0015\u001a\u0004\b'\u0010\u0017\"\u0004\b(\u0010\u0019R$\u0010-\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\r\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0011R$\u00101\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\r\u001a\u0004\b/\u0010\u000f\"\u0004\b0\u0010\u0011R$\u00105\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\r\u001a\u0004\b3\u0010\u000f\"\u0004\b4\u0010\u0011R$\u00109\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\r\u001a\u0004\b7\u0010\u000f\"\u0004\b8\u0010\u0011R$\u0010<\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\r\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b;\u0010\u0011R$\u0010@\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\r\u001a\u0004\b>\u0010\u000f\"\u0004\b?\u0010\u0011R$\u0010D\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\r\u001a\u0004\bB\u0010\u000f\"\u0004\bC\u0010\u0011R\"\u0010H\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010 \u001a\u0004\bF\u0010\"\"\u0004\bG\u0010$R$\u0010K\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\r\u001a\u0004\bI\u0010\u000f\"\u0004\bJ\u0010\u0011R\"\u0010O\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010\u0015\u001a\u0004\bM\u0010\u0017\"\u0004\bN\u0010\u0019R\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010Z\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010\r\u001a\u0004\b \u0010\u000f\"\u0004\bY\u0010\u0011¨\u0006`"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiGetTingAudioState$GetTingAudioStateTask", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "z", "Landroid/os/Parcel;", "parcel", org.chromium.base.BaseSwitches.V, "dest", "", "flags", "writeToParcel", "", "f", "Ljava/lang/String;", "B", "()Ljava/lang/String;", "U", "(Ljava/lang/String;)V", "appId", "", "g", "D", "F", "()D", "e0", "(D)V", "duration", "h", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "d0", "currentTime", "i", "I", "J", "()I", "j0", "(I)V", "paused", "m", "C", "X", "buffered", "n", "O", "u0", "src", "o", "Q", "w0", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "p", "G", "f0", "epname", "q", "M", "s0", "singer", "r", "Y", "coverImgUrl", "s", "R", "y0", "webUrl", "t", "L", "n0", "protocol", "u", "P", "v0", "startTime", "N", "t0", "songLyric", "w", "K", "m0", "playbackRate", "", "x", "Z", "H", "()Z", "g0", "(Z)V", "error", "y", "i0", "mErrorMsg", "<init>", "()V", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/audio/h0", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class JsApiGetTingAudioState$GetTingAudioStateTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final com.tencent.mm.plugin.appbrand.jsapi.audio.h0 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.audio.h0(null);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public java.lang.String appId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public double duration;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public double currentTime;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int paused;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public double buffered;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public java.lang.String src;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public java.lang.String title;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public java.lang.String epname;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public java.lang.String singer;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public java.lang.String coverImgUrl;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public java.lang.String webUrl;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public java.lang.String protocol;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public int startTime;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public java.lang.String songLyric;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public double playbackRate;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public boolean error;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public java.lang.String mErrorMsg;

    public JsApiGetTingAudioState$GetTingAudioStateTask() {
        this.appId = "";
    }

    /* renamed from: B, reason: from getter */
    public final java.lang.String getAppId() {
        return this.appId;
    }

    /* renamed from: C, reason: from getter */
    public final double getBuffered() {
        return this.buffered;
    }

    /* renamed from: D, reason: from getter */
    public final java.lang.String getCoverImgUrl() {
        return this.coverImgUrl;
    }

    /* renamed from: E, reason: from getter */
    public final double getCurrentTime() {
        return this.currentTime;
    }

    /* renamed from: F, reason: from getter */
    public final double getDuration() {
        return this.duration;
    }

    /* renamed from: G, reason: from getter */
    public final java.lang.String getEpname() {
        return this.epname;
    }

    /* renamed from: H, reason: from getter */
    public final boolean getError() {
        return this.error;
    }

    /* renamed from: I, reason: from getter */
    public final java.lang.String getMErrorMsg() {
        return this.mErrorMsg;
    }

    /* renamed from: J, reason: from getter */
    public final int getPaused() {
        return this.paused;
    }

    /* renamed from: K, reason: from getter */
    public final double getPlaybackRate() {
        return this.playbackRate;
    }

    /* renamed from: L, reason: from getter */
    public final java.lang.String getProtocol() {
        return this.protocol;
    }

    /* renamed from: M, reason: from getter */
    public final java.lang.String getSinger() {
        return this.singer;
    }

    /* renamed from: N, reason: from getter */
    public final java.lang.String getSongLyric() {
        return this.songLyric;
    }

    /* renamed from: O, reason: from getter */
    public final java.lang.String getSrc() {
        return this.src;
    }

    /* renamed from: P, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    /* renamed from: Q, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: R, reason: from getter */
    public final java.lang.String getWebUrl() {
        return this.webUrl;
    }

    public final void U(java.lang.String str) {
        this.appId = str;
    }

    public final void X(double d17) {
        this.buffered = d17;
    }

    public final void Y(java.lang.String str) {
        this.coverImgUrl = str;
    }

    public final void d0(double d17) {
        this.currentTime = d17;
    }

    public final void e0(double d17) {
        this.duration = d17;
    }

    public final void f0(java.lang.String str) {
        this.epname = str;
    }

    public final void g0(boolean z17) {
        this.error = z17;
    }

    public final void i0(java.lang.String str) {
        this.mErrorMsg = str;
    }

    public final void j0(int i17) {
        this.paused = i17;
    }

    public final void m0(double d17) {
        this.playbackRate = d17;
    }

    public final void n0(java.lang.String str) {
        this.protocol = str;
    }

    public final void s0(java.lang.String str) {
        this.singer = str;
    }

    public final void t0(java.lang.String str) {
        this.songLyric = str;
    }

    public final void u0(java.lang.String str) {
        this.src = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.appId = parcel.readString();
        this.duration = parcel.readDouble();
        this.currentTime = parcel.readDouble();
        this.paused = parcel.readInt();
        this.buffered = parcel.readDouble();
        this.src = parcel.readString();
        this.title = parcel.readString();
        this.epname = parcel.readString();
        this.singer = parcel.readString();
        this.coverImgUrl = parcel.readString();
        this.webUrl = parcel.readString();
        this.protocol = parcel.readString();
        this.songLyric = parcel.readString();
        this.startTime = parcel.readInt();
        this.playbackRate = parcel.readDouble();
        this.error = parcel.readInt() == 1;
        this.mErrorMsg = parcel.readString();
    }

    public final void v0(int i17) {
        this.startTime = i17;
    }

    public final void w0(java.lang.String str) {
        this.title = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.appId);
        dest.writeDouble(this.duration);
        dest.writeDouble(this.currentTime);
        dest.writeInt(this.paused);
        dest.writeDouble(this.buffered);
        dest.writeString(this.src);
        dest.writeString(this.title);
        dest.writeString(this.epname);
        dest.writeString(this.singer);
        dest.writeString(this.coverImgUrl);
        dest.writeString(this.webUrl);
        dest.writeString(this.protocol);
        dest.writeString(this.songLyric);
        dest.writeInt(this.startTime);
        dest.writeDouble(this.playbackRate);
        dest.writeInt(this.error ? 1 : 0);
        dest.writeString(this.mErrorMsg);
    }

    public final void y0(java.lang.String str) {
        this.webUrl = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        java.lang.String str = com.tencent.mm.plugin.appbrand.media.music.f.f85760a.f85761a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !kotlin.jvm.internal.o.b(str, this.appId)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiGetTingAudioState", "appid not match cannot get ting audio state, preAppId:" + str + ", appId:" + this.appId);
            this.error = true;
            this.mErrorMsg = "appid not match cannot get ting audio state";
            c();
            return;
        }
        rk4.z8 z8Var = (rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class));
        bw5.lp0 uj6 = z8Var.uj();
        if (uj6 != null) {
            qk.ia Ri = z8Var.Ri();
            int Ai = z8Var.Ai();
            int Di = z8Var.Di();
            if (Ri == qk.ia.f364170f || Ai < 0 || Di < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiGetTingAudioState", "return parameter is invalid, musicPlayerState:" + Ri + ", duration_t:" + Ai + ", position:" + Di);
                this.error = true;
                this.mErrorMsg = "return parameter is invalid";
                c();
                return;
            }
            double d17 = 1000;
            this.duration = Ai / d17;
            this.currentTime = Di / d17;
            jm4.g3 g3Var = zk4.l.f473540c;
            int s17 = g3Var != null ? (int) ((jm4.h3) g3Var).s() : 0;
            double d18 = this.duration;
            if (d18 > 0.0d) {
                this.buffered = (s17 * d18) / 100;
            }
            this.paused = !z8Var.nj() ? 1 : 0;
            this.src = rk4.j5.k(uj6);
            this.title = rk4.j5.j(uj6);
            bw5.v70 d19 = uj6.d();
            this.epname = d19.hasFieldNumber(5) ? d19.f34192h : "";
            this.singer = rk4.j5.c(uj6);
            this.coverImgUrl = rk4.j5.d(uj6);
            this.webUrl = rk4.j5.l(uj6);
            this.startTime = rk4.j5.i(uj6);
            this.playbackRate = z8Var.h();
            this.protocol = uj6.e().f27956i ? "hls" : "";
            this.songLyric = "";
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiGetTingAudioState", "playingItem is null");
            this.error = true;
            this.mErrorMsg = "playingItem is null";
        }
        c();
    }

    public JsApiGetTingAudioState$GetTingAudioStateTask(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.appId = "";
        v(parcel);
    }
}
