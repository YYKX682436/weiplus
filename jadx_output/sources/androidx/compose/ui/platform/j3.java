package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public abstract class j3 {
    public static final boolean a(float[] invertTo, float[] other) {
        kotlin.jvm.internal.o.g(invertTo, "$this$invertTo");
        kotlin.jvm.internal.o.g(other, "other");
        float f17 = invertTo[0];
        float f18 = invertTo[1];
        float f19 = invertTo[2];
        float f27 = invertTo[3];
        float f28 = invertTo[4];
        float f29 = invertTo[5];
        float f37 = invertTo[6];
        float f38 = invertTo[7];
        float f39 = invertTo[8];
        float f47 = invertTo[9];
        float f48 = invertTo[10];
        float f49 = invertTo[11];
        float f57 = invertTo[12];
        float f58 = invertTo[13];
        float f59 = invertTo[14];
        float f66 = invertTo[15];
        float f67 = (f17 * f29) - (f18 * f28);
        float f68 = (f17 * f37) - (f19 * f28);
        float f69 = (f17 * f38) - (f27 * f28);
        float f76 = (f18 * f37) - (f19 * f29);
        float f77 = (f18 * f38) - (f27 * f29);
        float f78 = (f19 * f38) - (f27 * f37);
        float f79 = (f39 * f58) - (f47 * f57);
        float f86 = (f39 * f59) - (f48 * f57);
        float f87 = (f39 * f66) - (f49 * f57);
        float f88 = (f47 * f59) - (f48 * f58);
        float f89 = (f47 * f66) - (f49 * f58);
        float f96 = (f48 * f66) - (f49 * f59);
        float f97 = (((((f67 * f96) - (f68 * f89)) + (f69 * f88)) + (f76 * f87)) - (f77 * f86)) + (f78 * f79);
        if (f97 == 0.0f) {
            return false;
        }
        float f98 = 1.0f / f97;
        other[0] = (((f29 * f96) - (f37 * f89)) + (f38 * f88)) * f98;
        other[1] = ((((-f18) * f96) + (f19 * f89)) - (f27 * f88)) * f98;
        other[2] = (((f58 * f78) - (f59 * f77)) + (f66 * f76)) * f98;
        other[3] = ((((-f47) * f78) + (f48 * f77)) - (f49 * f76)) * f98;
        float f99 = -f28;
        other[4] = (((f99 * f96) + (f37 * f87)) - (f38 * f86)) * f98;
        other[5] = (((f96 * f17) - (f19 * f87)) + (f27 * f86)) * f98;
        float f100 = -f57;
        other[6] = (((f100 * f78) + (f59 * f69)) - (f66 * f68)) * f98;
        other[7] = (((f78 * f39) - (f48 * f69)) + (f49 * f68)) * f98;
        other[8] = (((f28 * f89) - (f29 * f87)) + (f38 * f79)) * f98;
        other[9] = ((((-f17) * f89) + (f87 * f18)) - (f27 * f79)) * f98;
        other[10] = (((f57 * f77) - (f58 * f69)) + (f66 * f67)) * f98;
        other[11] = ((((-f39) * f77) + (f69 * f47)) - (f49 * f67)) * f98;
        other[12] = (((f99 * f88) + (f29 * f86)) - (f37 * f79)) * f98;
        other[13] = (((f17 * f88) - (f18 * f86)) + (f19 * f79)) * f98;
        other[14] = (((f100 * f76) + (f58 * f68)) - (f59 * f67)) * f98;
        other[15] = (((f39 * f76) - (f47 * f68)) + (f48 * f67)) * f98;
        return true;
    }
}
