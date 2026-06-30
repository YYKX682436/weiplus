package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2899xa7aadcf2;

/* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.ParseException */
/* loaded from: classes8.dex */
public class C25370x7587fafc extends java.lang.Exception {

    /* renamed from: curline */
    public int f45825x43291234;

    public C25370x7587fafc(java.lang.String str, java.lang.Exception exc, int i17) {
        super(str, exc);
        this.f45825x43291234 = i17;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return super.getMessage() + " line: " + this.f45825x43291234;
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return "ParseException{message = " + getMessage() + "}";
    }
}
