package com.tme.p3259xc83515e4.p3262x153e1c29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/tme/karaoke/lib_singscore/ScoreConfig;", "", "noteData", "", "stcTime", "", "stcToScore", "multiParam", "Lcom/tme/karaoke/lib_singscore/MultiParams;", "([B[I[ILcom/tme/karaoke/lib_singscore/MultiParams;)V", "getMultiParam", "()Lcom/tme/karaoke/lib_singscore/MultiParams;", "getNoteData", "()[B", "getStcTime", "()[I", "getStcToScore", "lib_singscore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: com.tme.karaoke.lib_singscore.ScoreConfig */
/* loaded from: classes5.dex */
public final class C28068xa1f8a054 {
    private final com.tme.p3259xc83515e4.p3262x153e1c29.C28063x4dbfd3ff multiParam;
    private final byte[] noteData;
    private final int[] stcTime;
    private final int[] stcToScore;

    public C28068xa1f8a054(byte[] noteData, int[] stcTime, int[] iArr, com.tme.p3259xc83515e4.p3262x153e1c29.C28063x4dbfd3ff c28063x4dbfd3ff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noteData, "noteData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stcTime, "stcTime");
        this.noteData = noteData;
        this.stcTime = stcTime;
        this.stcToScore = iArr;
        this.multiParam = c28063x4dbfd3ff;
    }

    public final com.tme.p3259xc83515e4.p3262x153e1c29.C28063x4dbfd3ff getMultiParam() {
        return this.multiParam;
    }

    public final byte[] getNoteData() {
        return this.noteData;
    }

    public final int[] getStcTime() {
        return this.stcTime;
    }

    public final int[] getStcToScore() {
        return this.stcToScore;
    }

    public /* synthetic */ C28068xa1f8a054(byte[] bArr, int[] iArr, int[] iArr2, com.tme.p3259xc83515e4.p3262x153e1c29.C28063x4dbfd3ff c28063x4dbfd3ff, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(bArr, iArr, (i17 & 4) != 0 ? null : iArr2, c28063x4dbfd3ff);
    }
}
