package oh1;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.class})
/* loaded from: classes9.dex */
public class o1 extends i95.w implements k01.v0 {
    public final android.text.SpannableString wi(android.content.Context context, int i17, android.graphics.Bitmap bitmap) {
        android.graphics.drawable.Drawable bitmapDrawable;
        if (bitmap == null) {
            bitmapDrawable = context.getResources().getDrawable(i17 == 1 ? com.p314xaae8f345.mm.R.raw.f81130x37087363 : com.p314xaae8f345.mm.R.raw.f81128xd0eae9f9);
        } else {
            bitmapDrawable = new android.graphics.drawable.BitmapDrawable(context.getResources(), bitmap);
        }
        bitmapDrawable.setBounds(0, 0, ik1.j0.a(16), ik1.j0.a(16));
        yl1.b bVar = new yl1.b(bitmapDrawable, 1);
        android.text.SpannableString spannableString = new android.text.SpannableString("@ ");
        spannableString.setSpan(bVar, 0, 1, 33);
        return spannableString;
    }
}
