package com.tencent.mm.feature.ecs.nirvana.input;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.FlutterJNI f65723a;

    public a(io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        this.f65723a = flutterJNI;
    }

    public boolean a(int i17) {
        return this.f65723a.isCodePointEmoji(i17);
    }

    public boolean b(int i17) {
        return (48 <= i17 && i17 <= 57) || i17 == 35 || i17 == 42;
    }

    public boolean c(int i17) {
        return this.f65723a.isCodePointVariantSelector(i17);
    }
}
