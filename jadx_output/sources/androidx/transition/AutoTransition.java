package androidx.transition;

/* loaded from: classes10.dex */
public class AutoTransition extends androidx.transition.TransitionSet {
    public AutoTransition() {
        c0();
    }

    public final void c0() {
        b0(1);
        X(new androidx.transition.Fade(2));
        X(new androidx.transition.ChangeBounds());
        X(new androidx.transition.Fade(1));
    }

    public AutoTransition(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        c0();
    }
}
