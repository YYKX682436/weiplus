package s31;

/* loaded from: classes12.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s31.e f483965d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s31.e eVar) {
        super(0);
        this.f483965d = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.mutate();
        int[] iArr = {android.R.attr.state_pressed};
        s31.e eVar = this.f483965d;
        stateListDrawable.addState(iArr, (android.graphics.drawable.GradientDrawable) ((jz5.n) eVar.f483970c).mo141623x754a37bb());
        stateListDrawable.addState(new int[]{-16842919}, (android.graphics.drawable.GradientDrawable) ((jz5.n) eVar.f483969b).mo141623x754a37bb());
        return stateListDrawable;
    }
}
