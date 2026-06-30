package ft3;

/* loaded from: classes12.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ft3.g f348081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ft3.g gVar) {
        super(0);
        this.f348081d = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.mutate();
        int[] iArr = {android.R.attr.state_pressed};
        ft3.g gVar = this.f348081d;
        stateListDrawable.addState(iArr, (android.graphics.drawable.GradientDrawable) ((jz5.n) gVar.f348085d).mo141623x754a37bb());
        stateListDrawable.addState(new int[]{-16842919}, (android.graphics.drawable.GradientDrawable) ((jz5.n) gVar.f348084c).mo141623x754a37bb());
        return stateListDrawable;
    }
}
